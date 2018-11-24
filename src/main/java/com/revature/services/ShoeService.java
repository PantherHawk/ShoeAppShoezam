package com.revature.services;

import java.util.List;

import com.revature.beans.Shoe;

public interface ShoeService {
	
	public List<Shoe> fetchAllShoes();
	public List<Shoe> fetchShoesByColor(String color);
	public List<Shoe> fetchShoesByBrand(String brand);
	public List<Shoe> fetchShoesBySize(Double min, Double max);
	public List<Shoe> fetchShoesByPriceRange(Double min, Double max);
	public Shoe fetchOneShoe();
	public Shoe updateShoe(Shoe shoe);
	public Shoe removeShoe(Shoe shoe);
	public Shoe addShoe(Shoe shoe);

}
