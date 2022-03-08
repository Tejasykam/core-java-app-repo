package com.sapient.aem.model;

public class Employee {
	private Integer empid;
	private String ename;
	private Double salary;
	private String job;

	public Employee() {

	}


	public Employee(Integer empid, String ename, Double salary, String job) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.job = job;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + ", job=" + job + "]";
	}

}
