package com.revature.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

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

}
