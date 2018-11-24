package com.revature.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.beans.Client;
import com.revature.daos.ClientDaoImp;

@Service
public class ClientService {

	private static ClientService clientService;
	public ClientService() {
		
	}
	public static ClientService getInstance() {
		if (clientService == null) {
			clientService = new ClientService();
		}
		return clientService;
	}
	
	public Client login(Client client) {
//		return ClientDaoImp.getInstance().get(client);
		return ClientDaoImp.getInstance().login(client);
	}
	
	public List<Client> getAll() {
		return ClientDaoImp.getInstance().getAll();
	}
	
	public Client getOne(Client client) {
		return ClientDaoImp.getInstance().get(client);
	}
	
	public boolean deleteClient(Client client) {
		ClientDaoImp.getInstance().remove(client);
		Client notFound = ClientDaoImp.getInstance().get(client);
		if (notFound == null) {
			return true;
		}
		return false;
	}
	
	public boolean createClient(Client client) {
		int result = ClientDaoImp.getInstance().create(client);
		if (result > 0) {
			return true;
		}
		return false;
	}
	
	public void editClient(Client client) {
		ClientDaoImp.getInstance().update(client);
	}
}
