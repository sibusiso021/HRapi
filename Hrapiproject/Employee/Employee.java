package Hrapiproject.Employee;



public class Employee {
	private int identificationNumber;
	private String name;
	private double salary;
	
	
	public Employee(int identificationNumber,String name, double salary ) {
		this.identificationNumber = identificationNumber;
		this.name = name;
		this.salary = salary;
		
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return this.identificationNumber + this.name  + this.salary;
		
	}
	


}

