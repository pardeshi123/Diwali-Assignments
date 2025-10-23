package dao;

import java.util.List;

import beans.Employee;

public interface EmployeeDao {

	void addEmployee(Employee emp);


	boolean removeEmployee(int id);


	List<Employee> DisplayAllEmp();


	List<Employee> getSortedEmployees();


	Object getAllEmployees();


	Employee findByName(String name);

}
