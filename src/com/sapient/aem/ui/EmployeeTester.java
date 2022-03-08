package com.sapient.aem.ui;

import com.sapient.aem.exception.EmployeeException;
import com.sapient.aem.model.Employee;

public class EmployeeTester {
	public static void mian(String args[]) {
		
	}
	public void getSalaryException() {
		Employee e = new Employee();
		try {
			if(e.getSalary()<0) {
			throw new EmployeeException("Salary is lessThan zero");
			}
		}catch(EmployeeException e1) {
			System.out.println(e1.getMessage());
		}
	}
}                 
