package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		//Department obj = new Department(1, "Books");
		
		//Seller sl = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		
		SellerDao sDao = DaoFactory.createSellerDao();
		
		Seller aa = sDao.findById(3);
		
		
		System.out.println(aa);

	}

}
