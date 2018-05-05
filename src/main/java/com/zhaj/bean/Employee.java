package com.zhaj.bean;

public class Employee {
	// 员工id
	private String empId;
	// 员工姓名
	private String empName;
	// 员工电话
	private String empTel;
	// 员工性别 1男，0女
	private Integer empGender;
	// 员工邮箱
	private String empEmail;
	// 部门id
	private String dId;
	// 部门,查询员工信息的同时查出来部门信息
	private Department department;

	// 生成有参构造器
	public Employee(String empId, String empName, String empTel, int empGender, String empEmail, String dId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empTel = empTel;
		this.empGender = empGender;
		this.empEmail = empEmail;
		this.dId = dId;
	}

	// 生成无参构造器
	public Employee() {
		super();
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName == null ? null : empName.trim();
	}

	public String getEmpTel() {
		return empTel;
	}

	public void setEmpTel(String empTel) {
		this.empTel = empTel;
	}

	public Integer getEmpGender() {
		return empGender;
	}

	public void setEmpGender(Integer empGender) {
		this.empGender = empGender;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail == null ? null : empEmail.trim();
	}

	public String getdId() {
		return dId;
	}

	public void setdId(String dId) {
		this.dId = dId;
	}
}