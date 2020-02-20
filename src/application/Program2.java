package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		System.out.println("=== Teste 1 : findById ====");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = departmentDao.findById(3);		
		System.out.println(department);
		
		System.out.println("\n=== Teste 2 : findAll ====");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Teste 3 : teste insert ====");
		department = new Department(null, "Music");
		departmentDao.insert(department);
		System.out.println("Insert completed. New Id: " + department.getId());
		
		System.out.println("\n=== Teste 4 : teste update ====");
		department = new Department(5, "Music");
		departmentDao.update(department);
		System.out.println("Update completed.");
		
		System.out.println("\n=== Teste 5 : teste delete ====");	
		departmentDao.deleteById(7);		
		System.out.println("Delete completed");
		
	}

}
