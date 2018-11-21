package com.revature.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.hibernate.query.Query;

import com.revature.beans.Client;
import com.revature.util.HibernateUtil;

public class ClientDaoImp implements ClientDao {
	
	private static ClientDaoImp clientDaoImp;
	private ClientDaoImp() {
		
	}
	public static ClientDaoImp getInstance() {
		if (clientDaoImp == null) {
			clientDaoImp = new ClientDaoImp();
		}
		return clientDaoImp;
	}

	@Override
	public Client get(Client client) {
		Session s = HibernateUtil.getSession();
		Client user = s.get(Client.class, client.getUserid());
		return user;
	}

	@Override  
	public List<Client> getAll() {
		Session s = HibernateUtil.getSession();
		List<Client> clients = s.createQuery("from Client").list();
		s.close();
		return clients;
	}

	@Override
	public void remove(Client client) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.getTransaction();
		s.delete(client);
		tx.commit();
		s.close();
	}

	@Override
	public int create(Client client) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		int success = (int) s.save(client);
		tx.commit();
		s.close();
		if (success > 0) {
			return success;
		}
		return 0;
	}

	@Override
	public void update(Client client) {
		Session s = HibernateUtil.getSession();
		Transaction tx = s.getTransaction();
		s.update(client);
		tx.commit();
		s.close();
	}
	@Override
	public Client login(Client client) {
		Session s = HibernateUtil.getSession();
		
//		Client c = (Client) s.createCriteria(Client.class).add(Example.create(client));1
//		String hql = "from Client where email = :email and pass = :pass";
//		Client found = (Client) s.createQuery(hql).setParameter("email", client.getEmail()).setParameter("pass", client.getPass());
//		Client found = (Client) s.createNativeQuery("SELECT * FROM CLIENT C WHERE C.EMAIL = ? AND C.PASS = ?", Client.class)
//				.setParameter(1, client.getEmail())
//				.setParameter(2, client.getPass());
		Query<Client> q = s.createQuery("from Client where email = :email and pass = :pass")
								.setParameter("email", client.getEmail())
								.setParameter("pass", client.getPass());
		Client c = (Client) q.getSingleResult();
		System.out.println(c);
		return c;
	}

}
