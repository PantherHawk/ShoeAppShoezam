package com.revature.daos;

import java.util.List;

import com.revature.beans.Client;

public interface ClientDao {

	public Client get(Client client);
	public List<Client> getAll();
	public void remove(Client client);
	public int create(Client client);
	public void update(Client client);
	
}
