package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import models.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("\n=== TEST 3: seller findAll =====");
		List <Department>list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
	
		/*System.out.println("\n=== TEST 4: Department insert =====");
		Department newDepartment = new Department(null, "Gui");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());*/
		
		System.out.println("\n=== TEST 5: department update =====");
		department = departmentDao.findById(5);
		department.setName("Martha Waine");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 6: department delete =====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");

		sc.close();
	}

}
