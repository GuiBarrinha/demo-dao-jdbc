package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import models.entities.Department;
import models.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("\n=== TEST 3: seller findAll =====");
		List <Department>list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
	}

}
