package com.revature.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.beans.Shoe;
import com.revature.daos.ShoeDaoImp;

@Service
public class ShoeServiceImp implements ShoeService {

	private static ShoeServiceImp shoeServiceImp;
	public ShoeServiceImp() {
		
	}
	public static ShoeServiceImp getInstance() {
		if (shoeServiceImp == null) {
			shoeServiceImp = new ShoeServiceImp();
		}
		return shoeServiceImp;
	}
	
	public List<Shoe> fetchAllShoes() {
		return ShoeDaoImp.getInstance().getAll();
	}
	@Override
	public List<Shoe> fetchShoesByColor(String color) {
		return ShoeDaoImp.getInstance().getByColor(color);
	}
	@Override
	public List<Shoe> fetchShoesBySize(Double size) {
		return ShoeDaoImp.getInstance().getBySize(size);
	}
	@Override
	public List<Shoe> fetchShoesByBrand(String brand) {
		return ShoeDaoImp.getInstance().getByBrand(brand);
	}
	@Override
	public List<Shoe> fetchShoesBySizeRange(Double min, Double max) {
		return ShoeDaoImp.getInstance().getBySizerange(min, max);
	}
	@Override
	public List<Shoe> fetchShoesByPriceRange(Double min, Double max) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Shoe fetchOneShoe() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Shoe updateShoe(Shoe shoe) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Shoe removeShoe(Shoe shoe) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Shoe addShoe(Shoe shoe) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
