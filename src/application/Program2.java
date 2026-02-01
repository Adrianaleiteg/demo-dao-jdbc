package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println();
		System.out.println("============================= Test 1: Department update =============================");
		Department dep2 = departmentDao.findById(4);
		dep2.setName("Support");
		departmentDao.update(dep2);
		System.out.println("Update completed");

		System.out.println("============================= Test 2: Department insert =============================");
		Department dep = new Department(null, "QA");
		departmentDao.insert(dep);
		System.out.println("Department inserted! New id = " + dep.getId());

		System.out.println();
		System.out.println("============================= Test 3: Department findById =============================");
		Department department = departmentDao.findById(10);
		System.out.println(department);

		System.out.println();
		System.out.println("============================= Test 4: Department findAll =============================");
		List<Department> list = departmentDao.findAll();
		for (Department department2 : list) {
			System.out.println(department2);
		}

		System.out.println();
		System.out.println("============================= Test 5: Department delete =============================");
		System.out.print("Enter id for delete test: ");
		int id = in.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");

		in.close();

	}

}
