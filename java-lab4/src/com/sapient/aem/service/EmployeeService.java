package com.sapient.aem.service;

import com.sapient.aem.bean.Employee;

public interface EmployeeService {
	public Employee getEmpDetails();
	public String insuranceScheme(String designation,double Salary);
	public void EmpDetails(Employee emp);
	
	

}
