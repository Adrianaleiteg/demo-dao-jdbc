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
		Scanner in = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		/*

		System.out.println("====================== Teste 1: Seller findById ======================");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println();

		System.out.println("====================== Teste 2: Seller findByDepartment ======================");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller seller2 : list) {
			System.out.println(seller2);
		}

		System.out.println();
		System.out.println("====================== Teste 3: Seller findAll ======================");
		list = sellerDao.findAll();
		for (Seller seller2 : list) {
			System.out.println(seller2);
		}

		System.out.println();
		System.out.println("====================== Teste 4: Seller insert ======================");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4500.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());

		System.out.println();
		System.out.println("====================== Teste 5: Seller update ======================");
		seller = sellerDao.findById(1);
		seller.setName("Marta Waine");
		seller.setBirthDate(new Date());
		seller.setBaseSalary(10000.00);
		sellerDao.update(seller);
		System.out.println("Update completed");
		*/

		System.out.println();
		System.out.println("====================== Teste 6: Seller delete ======================");
		System.out.print("Enter id for delete test: ");
		int id = in.nextInt();

		sellerDao.deleteById(id);

		System.out.println("Delete completed");

		in.close();
	}

}
