package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department insert ====");
        Department newDepartment = new Department(null, "Basketball");
        departmentDao.insert(newDepartment);
        System.out.println("Previous name was: " + newDepartment.getName());
        System.out.println("Inserted! New id = " + newDepartment.getId());

/*
        System.out.println("\n=== TEST 2: department update ====");
        newDepartment.setName("hockey");
        departmentDao.update(newDepartment);
        System.out.println("Update completed!");

        System.out.println("\n=== TEST 3: department delete ====");
        departmentDao.deleteById(5);
        System.out.println("Delete completed!");
*/

        System.out.println("\n=== TEST 4: department findById ====");
        newDepartment = departmentDao.findById(2);
        System.out.println(newDepartment);

        System.out.println("\n=== TEST 5: department findAll ====");
        List<Department> list = departmentDao.findAll();
        for(Department obj : list) {
            System.out.println(obj);
        }
    }
}
