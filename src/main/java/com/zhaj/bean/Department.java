package com.zhaj.bean;

public class Department {
    private String deptId;

    private String deptName;

    public String getDeptId() {
        return deptId;
    }
    //�����޲εĹ��캯��
    public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	//�����в����Ĺ��캯��
    public Department(String deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }
}