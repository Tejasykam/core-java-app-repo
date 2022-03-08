package com.sapient.aem.service;


import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

import com.sapient.aem.exception.EmployeeException;
import com.sapient.aem.model.Employee;
public interface EmployeeService {
	int[] employees = null;

	// Double getTotalSalary(Employee employees[]);
	// returns sum of salary of all employees
	public static double getTotalSalary(Employee employees[]) {
		try {
			Stream<Employee> employeeStream=Arrays.stream(employees);
			Optional<Double> optional=employeeStream
					.map((s)->s.getSalary())
					.reduce((a,b)->a+b);
			if(optional.isPresent()) {
				return optional.get();
			}else {
				return 0.0;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0.0;

}
	//String[] getEmployeeNames(Employee employees[]);
	//returns names of all the employees
	
	public static String[] getEmployeeNames(Employee employees[]) {
		try {
			String [] obj=Arrays.stream(employees)
						.map((a)->a.getEname())
						.toArray((size->new String[size]));
			return obj;
		
		
	}
	returns names of all the employees

}