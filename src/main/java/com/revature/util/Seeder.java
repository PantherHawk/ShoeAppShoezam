package com.revature.util;

import com.revature.beans.Client;
import com.revature.beans.Shoe;
import com.revature.beans.ShoeRequest;
import com.revature.daos.ClientDao;
import com.revature.daos.ClientDaoImp;
import com.revature.daos.ShoeDaoImp;
import com.revature.daos.ShoeRequestDaoImp;

public class Seeder {
	
	public static void main(String[] args) {
		
		ShoeDaoImp sd = new ShoeDaoImp();
	ClientDaoImp cd = new ClientDaoImp();
		ShoeRequestDaoImp sr = new ShoeRequestDaoImp();
		
//		10 CLIENTS IN DB
		Client pam = new Client("Pam", "Beasely", "pamb@pratinstitutde.edu", "password", "213 cherry lane", 38383, "USA", "909-999-9999");
		Client jim = new Client("Jim", "Halpern", "jh@dundermifflin.biz", "password", "213 cherry lane", 38383, "USA", "909-999-9999");
		Client stanley = new Client("Stanley", "Hudson", "sh@dundermifflin.biz", "password", "213 cherry lane", 38383, "USA", "909-999-9999");
		Client dwight = new Client("Dwight", "Schrute", "dw@dundermifflin.biz", "password", "213 cherry lane", 38383, "USA", "909-999-9999");
		Client kevin = new Client("Kevin", "Malone", "km@dundermifflin.biz", "password", "213 cherry lane", 38383, "USA", "909-999-9999");
		Client angela = new Client("Angela", "Martin", "am@dundermifflin.biz", "password", "213 cherry lane", 38383, "USA", "909-999-9999");
		Client merideth = new Client("Merideth", "Palmer", "mp@dundermifflin.biz", "password", "213 cherry lane", 38383, "USA", "909-999-9999");
		Client kelly = new Client("Kelly", "Kapoor", "kp@dundermifflin.biz", "password", "213 cherry lane", 38383, "USA", "909-999-9999");
		Client michael = new Client("Michael", "Scott", "ms@dundermifflin.biz", "password", "213 cherry lane", 38383, "USA", "909-999-9999");
		Client craig = new Client("Craig", "Robinson", "cr@dundermifflin.biz", "password", "213 cherry lane", 38383, "USA", "909-999-9999");
		Client ellie = new Client("Ellie", "Kemper", "ek@dundermifflin.biz", "password", "213 cherry lane", 38383, "USA", "909-999-9999");

		
		Client[] clients = {pam, jim, stanley, dwight, kevin, angela, merideth, kelly, michael, craig, ellie};
		for (Client c : clients) {
			cd.create(c);
		}
		
		
		
//		10 SHOES IN DB
		sd.add(new Shoe(jim, "Classic", "Addidas", 12.5, 245.00, "Red", 0));
		sd.add(new Shoe(jim, "Downshifter", "Nike", 10.0, 50.00, "Green", 1));
		sd.add(new Shoe(jim, "Air Max Infuriate", "Nike", 12.5, 57.00, "White", 0));
		sd.add(new Shoe(jim, "Cloadfoam", "Addidas", 10.0, 210.05, "White", 0));
		sd.add(new Shoe(pam, "Air Jordans", "Nike", 9.5, 1200.0, "Blue", 0));
		sd.add(new Shoe(jim, "Men's Tanjun Sneakers", "Nike", 10.0, 200.00, "Black", 0));
		sd.add(new Shoe(jim, "Shox Gravity Running Shoes", "Nike", 8.5, 150.0, "Grey", 0));
		sd.add(new Shoe(pam, "Men's Air Max 90", "Nike", 9.5, 59.00, "Blue", 0));
		sd.add(new Shoe(pam, "Air Force", "Nike", 13.0, 49.95, "Green", 0));
		sd.add(new Shoe(pam, "Men's Cour Borough", "Nike", 12.0, 39.94, "Black", 0));
		sd.add(new Shoe(craig, "Men's 574 V2", "New Balance", 8.5, 40.94, "Blue", 0));
		sd.add(new Shoe(michael, "Skylon 2", "Nike", 10.0, 640.00, "Yellow", 0));
		
		Shoe nikes = sd.getOneShoe(new Shoe(1));
		Shoe airJs = sd.getOneShoe(new Shoe(6));
		ShoeRequest shoreq = new ShoeRequest(jim, pam, nikes, airJs, "I'd love to trade shoes with you Jim.");
//		ShoeRequest resolved = new ShoeRequest(1, pam, jim, nikes, airJs, "I'd love to trade shoes with you Jim.");
		sr.add(shoreq);
		
		sr.add(new ShoeRequest(jim, craig, sd.getOneShoe(new Shoe(1)), sd.getOneShoe(new Shoe(11)), "Let's swap homie."));
		sr.add(new ShoeRequest(pam, craig, sd.getOneShoe(new Shoe(6)), sd.getOneShoe(new Shoe(11)), "Yo dog, I like those kicks."));
		sr.add(new ShoeRequest(jim, craig, sd.getOneShoe(new Shoe(12)), sd.getOneShoe(new Shoe(11)), "Gotta have them pumps, son."));
		sr.add(new ShoeRequest(jim, pam, sd.getOneShoe(new Shoe(3)), sd.getOneShoe(new Shoe(8)), "These are so beautiful!"));
		sr.add(new ShoeRequest(jim, craig, sd.getOneShoe(new Shoe(1)), sd.getOneShoe(new Shoe(11)), "DM me bro."));
		sr.add(new ShoeRequest(michael, jim, sd.getOneShoe(new Shoe(2)), sd.getOneShoe(new Shoe(12)), "Oh snap! The Skylons?  Yes please."));
		sr.add(new ShoeRequest(craig, pam, sd.getOneShoe(new Shoe(6)), sd.getOneShoe(new Shoe(11)), "Air Jordans, aww yessss."));
		sr.add(new ShoeRequest(pam, jim, sd.getOneShoe(new Shoe(8)), sd.getOneShoe(new Shoe(11)), "Can we trade shoes?"));
		sr.add(new ShoeRequest(pam, craig, sd.getOneShoe(new Shoe(10)), sd.getOneShoe(new Shoe(11)), "Is that you, Craig?"));
	}
	
}
