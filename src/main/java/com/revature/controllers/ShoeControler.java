package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/color/{whichColor}")
	@ResponseBody
	public List<Shoe> getShoesByColor(@PathVariable("whichColor") String color) {
		List<Shoe> coloredShoes = shoeService.fetchShoesByColor(color);
		return coloredShoes;
	}
	
	@GetMapping("/brand/{whichBrand}")
	@ResponseBody
	public List<Shoe> getShoesByBrand(@PathVariable("whichBrand") String brand) {
		List<Shoe> brandShoes = shoeService.fetchShoesByBrand(brand);
		return brandShoes;
	}
	
	@GetMapping("/size/{whichSize}")
	@ResponseBody
	public List<Shoe> getShoesBySize(@PathVariable("whichSize") Double size) {
		List<Shoe> shoesOfSize = shoeService.fetchShoesBySize(size);
		return shoesOfSize;
	}
	
	@GetMapping("/size/{min}/{max}")
	@ResponseBody
	public List<Shoe> getShoesInSizeRange(@PathVariable("min") Double min, @PathVariable("max") Double max) {
		List<Shoe> shoesInRange = shoeService.fetchShoesBySizeRange(min, max);
		return shoesInRange;
	}
}
