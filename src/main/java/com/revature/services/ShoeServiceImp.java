package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Client;
import com.revature.beans.Shoe;
import com.revature.daos.ShoeDaoImp;

@Service
public class ShoeServiceImp implements ShoeService {
	
	@Autowired
	ShoeDaoImp shoeDaoImp;
	
	public List<Shoe> fetchAllShoes() {
		return shoeDaoImp.getAll();
	}
	@Override
	public List<Shoe> fetchShoesByColor(String color) {
		return shoeDaoImp.getByColor(color);
	}
	@Override
	public List<Shoe> fetchShoesBySize(Double size) {
		return shoeDaoImp.getBySize(size);
	}
	@Override
	public List<Shoe> fetchShoesByBrand(String brand) {
		return shoeDaoImp.getByBrand(brand);
	}
	@Override
	public List<Shoe> fetchShoesBySizeRange(Double min, Double max) {
		return shoeDaoImp.getBySizerange(min, max);
	}
	@Override
	public List<Shoe> fetchShoesByPriceRange(Double min, Double max) {
		return shoeDaoImp.getByPricerange(min, max);
	}
	@Override
	public Shoe fetchOneShoe(Integer id) {
		return shoeDaoImp.getOneShoe(new Shoe(id));
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
		shoeDaoImp.add(shoe);
		return shoe;
	}
	@Override
	public List<Shoe> fetchShoesBelongingToClient(Client client) {
		return shoeDaoImp.getShoesByClientId(client);
	}
	
}
