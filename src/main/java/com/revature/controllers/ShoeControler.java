package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.beans.Shoe;
import com.revature.services.ShoeService;

//@RestController
@Controller
@RequestMapping("shoes")
public class ShoeControler {
	
	@Autowired
	ShoeService shoeService;

//	
//	@RequestMapping(value="/shoes", method=RequestMethod.GET)
//	@RequestMapping
	@GetMapping
	@ResponseBody
	public List<Shoe> getAllShoes() {
		System.out.println("Hit get all shoes...");
		List<Shoe> allShoes = shoeService.fetchAllShoes();
		return allShoes;
	}
}
