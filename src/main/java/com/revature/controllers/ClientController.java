package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.beans.Client;
import com.revature.services.ClientService;

@Controller
public class ClientController {

	@GetMapping("/clients")
//	@RequestMapping(value="/clients", method=RequestMethod.GET)
	@ResponseBody
	public List<Client> getClientById() {
		System.out.println("Hit Client Controller...");
		List<Client> allTheClients = ClientService.getInstance().getAll();
		return allTheClients;
	}
	
	@RequestMapping(value="/clients/login", method=RequestMethod.POST)
	@ResponseBody
	public Client getClientViaLogin(@RequestBody Client client) {
		System.out.println("Hit login controller");
		System.out.println("Login request body: " + client);
		return ClientService.getInstance().login(client);
//		return ClientService.getInstance().login(client);
	}
	
	@RequestMapping(value="/clients", method=RequestMethod.POST)
	@ResponseBody
	public Client getOneClient(@RequestBody Client client) {
		return ClientService.getInstance().getOne(client);
	}
	
	@RequestMapping(value="/clients/:id", method=RequestMethod.POST)
	public boolean removeClient(@RequestBody Client client) {
		return ClientService.getInstance().deleteClient(client);
	}
	
	@RequestMapping(value="/clients", method=RequestMethod.POST)
	@ResponseBody
	public boolean add(@RequestBody Client client) {
		return ClientService.getInstance().createClient(client);
	}
	
	@RequestMapping(value="/clients", method=RequestMethod.PUT)
	@ResponseBody
	public void edit(@RequestBody Client client) {
		ClientService.getInstance().editClient(client);
	}
}
