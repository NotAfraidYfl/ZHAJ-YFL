package com.zhaj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhaj.bean.Department;
import com.zhaj.dao.DepartmentMapper;

@Service
public class DepartmentService {
	@Autowired
	DepartmentMapper departmentMapper;

	public List<Department> getAll() {
		return departmentMapper.selectByExample(null);
	}
}
