package eservice;

import java.util.List;

import beans.Employee;

public interface EmployeeService {

	void addEmployee(Employee emp);


	boolean removeEmployeeById(int id);


	List<Employee> DisplayAllEmployee();


	List<Employee> getSortedEmployees();


	Employee findByName(String name);


	void saveEmployeesToFile();
 
}
