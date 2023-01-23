package Hrapiproject.Department;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import Hrapiproject.Employee.Employee;

public class Department {
	
	private int lastem = -1;
	
	private String name;

	
	private Employee[] employees = new Employee[10];
	
	
	public Department(String name) {
		this.name = name;
		
	}

	public Employee[] getEmployees() {
		
		
		Employee[] actualemployees = new Employee[lastem + 1];
		for(int i = 0; i < actualemployees.length; i++ ) {
			actualemployees[i] = employees[i];
		}
		return actualemployees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	
	public void addemployee(Employee anem){
		
		if(lastem < employees.length) {
			lastem ++;
			employees[lastem] = anem;
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Employee[] allEmployees() {
		
		boolean empty = true;
		
		for(int i = 0; i < this.employees.length; i++) {
			if(this.employees[i] != null) {
				empty = false;
			}
			break;
		}
		
		return this.employees;
		
	}
	
	public int numberOfemployees() {

		
		return lastem + 1;
		
	}
	
	public Employee employeeid(int getid) {
		
		Employee results = null;
		
		for(Employee em1 : this.employees) {
			if(em1.getIdentificationNumber() == (getid)) {
				results = em1;
			}
			break;
		}
			
		return results;
		
	}
	
	
//	public double allSalary() {
//		double totalsalary = 0.0;
//		
//		for(Employee em : this.employees) {
//			totalsalary = totalsalary + em.getSalary();
//		}
//			
//		return totalsalary;
//	}
	
	public double allSalary() {
		double totalsalary = 0.0;
		for(int i = 0; i < lastem ; i++) {
			totalsalary += this.employees[i].getSalary();
		}
		
		return totalsalary;
	}
	
//	public double averageSalary() {
//		double totalsalary = 0.0;
//		
//		for(Employee em : this.employees) {
//			totalsalary = totalsalary + em.getSalary();
//		}
//			
//		return totalsalary / this.employees.length;
//		
//	}
	public double averageSalary() {
		if(lastem > -1 ) {
			return allSalary() / lastem + 1;
		}
		
		return 0.0;
	}

	
	


	


}

