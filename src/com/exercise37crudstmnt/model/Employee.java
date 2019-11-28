package com.exercise37crudstmnt.model;

public class Employee {
	private int IdEmployee;
	private String nameEmployee;
	private int ageEmployee;
	private String addressEmployee;
	private double salaryEmployee;
	private String departmentEmployee;
	
	
	public Employee() {}
	
	
	/***
	 * @param IdEmployee Id of the employee
	 * @param nameEmployee Name of the employee
	 * @param ageEmployee Age of the employee
	 * @param addressEmployee Address of the employee
	 * @param salaryEmployee Salary of the employee
	 * @param departmentEmployee Department of the employee
	 * 
	 * @return no values returned
	 */
	public Employee(int IdEmployee, String nameEmployee, int ageEmployee, String addressEmployee, double salaryEmployee, String departmentEmployee) {
		this.IdEmployee = IdEmployee;
		this.nameEmployee = nameEmployee;
		this.ageEmployee = ageEmployee;
		this.addressEmployee = addressEmployee;
		this.salaryEmployee = salaryEmployee;
		this.departmentEmployee = departmentEmployee;
	}
	
	public int getIdEmployee() {
		return this.IdEmployee;
	}
	
	public void setIdEmployee(int IdEmployee) {
		this.IdEmployee = IdEmployee;
	}
	
	public String getNameEmployee() {
		return this.nameEmployee;
	}
	
	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}
	
	public int getAgeEmployee() {
		return this.ageEmployee;
	}
	
	public void setAgeEmployee(int ageEmployee) {
		this.ageEmployee = ageEmployee;
	}
	
	public String getAddressEmployee() {
		return this.addressEmployee;
	}
	
	public void setAddressEmployee(String addressEmployee) {
		this.addressEmployee = addressEmployee;
	}
	
	public double getSalaryEmployee() {
		return this.salaryEmployee;
	}
	
	public void setSalaryEmployee(double salaryEmployee) {
		this.salaryEmployee = salaryEmployee;
	}
	
	
	public String getDepartmentEmployee() {
		return this.departmentEmployee;
	}
	
	public void setDepartmentEmployee(String departmentEmployee) {
		this.departmentEmployee = departmentEmployee;
	}
	
	public String toString() {
		String cad = "idEmployee: " + this.IdEmployee + 
				"\n nameEmployee: " + this.nameEmployee + 
				"\n ageEmployee: " + this.ageEmployee +
				"\n addressEmployee: " + this.addressEmployee +
				"\n salaryEmployee: " + this.salaryEmployee +
				"\n departmentEmployee: " + this.departmentEmployee;
		
		return cad;
	}
}
