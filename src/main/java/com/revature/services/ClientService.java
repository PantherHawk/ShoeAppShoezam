package com.revature.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.beans.Client;
import com.revature.daos.ClientDaoImp;

//@Service
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
		return ClientDaoImp.getInstance().get(client);
	}
	
	public List<Client> getAll() {
		return ClientDaoImp.getInstance().getAll();
	}
}
