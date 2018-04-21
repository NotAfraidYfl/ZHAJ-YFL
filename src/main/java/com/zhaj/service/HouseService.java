package com.zhaj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhaj.bean.House;
import com.zhaj.dao.HouseMapper;

@Service
public class HouseService {
	@Autowired
	HouseMapper houseMapper;

	public List<House> getAll() {
		return houseMapper.selectByExample(null);
	}

}
