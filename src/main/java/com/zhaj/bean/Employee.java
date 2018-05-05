package com.zhaj.bean;

public class Employee {
	// Ա��id
	private String empId;
	// Ա������
	private String empName;
	// Ա���绰
	private String empTel;
	// Ա���Ա� 1�У�0Ů
	private Integer empGender;
	// Ա������
	private String empEmail;
	// ����id
	private String dId;
	// ����,��ѯԱ����Ϣ��ͬʱ�����������Ϣ
	private Department department;

	// �����вι�����
	public Employee(String empId, String empName, String empTel, int empGender, String empEmail, String dId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empTel = empTel;
		this.empGender = empGender;
		this.empEmail = empEmail;
		this.dId = dId;
	}

	// �����޲ι�����
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