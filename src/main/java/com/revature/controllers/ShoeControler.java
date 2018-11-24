package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.revature.beans.Shoe;
import com.revature.services.ShoeService;

//@RestController
@Controller
@RequestMapping("shoes")
public class ShoeControler {
	
	@Autowired
	ShoeService shoeService;

	
	@RequestMapping(value="/shoes", method=RequestMethod.GET)
//	@RequestMapping
	public List<Shoe> getAllShoes() {
		return shoeService.fetchAllShoes();
	}
}
