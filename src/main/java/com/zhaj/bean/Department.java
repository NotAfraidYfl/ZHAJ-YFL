package com.zhaj.bean;

public class Department {
    private String deptId;

    private String deptName;

    public String getDeptId() {
        return deptId;
    }
    //生成无参的构造函数
    public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	//生成有参数的构造函数
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