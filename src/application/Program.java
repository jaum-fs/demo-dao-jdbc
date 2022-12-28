package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		SellerDao sDao = DaoFactory.createSellerDao();
		
		
		System.out.println("=============== findById ===============");
		Seller seller = sDao.findById(3);
		System.out.println(seller + "\n");
		
		System.out.println("\n=============== findByDepartment ===============");
		Department obj = new Department(2, null);
		List<Seller> list = sDao.findByDepartment(obj);
		for(Seller x : list) {
			System.out.println(x);
		}
		
		System.out.println("\n=============== findAll ===============");
		List <Seller> listFindAll = sDao.findAll();
		for(Seller x : listFindAll) {
			System.out.println(x);
		}
		
		System.out.println("\n=============== INSERT ===============");
		Seller sll = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, obj);
		sDao.insert(sll);
		System.out.println("Inserido! id = " + sll.getId());
		
		System.out.println("\n=============== UPDATE ===============");
		seller = sDao.findById(1);
		seller.setName("Marth Waine");
		sDao.update(seller);
		System.out.println("Update concluido");
		
		
		System.out.println("\n=============== DELETE ===============");
		System.out.println("Escolha o id para deletar: ");
		int id = sc.nextInt();
		sDao.deleteById(id);
		System.out.println("Deletado com sucesso");
		sc.close();
		
		
		
		
	}

}
