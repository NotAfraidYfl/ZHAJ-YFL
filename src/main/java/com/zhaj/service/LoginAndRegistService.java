package com.zhaj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhaj.bean.LoginUser;
import com.zhaj.dao.LoginUserMapper;


@Service
public class LoginAndRegistService {

	@Autowired
	LoginUserMapper loginUserMapper;
	
	public int insertUser(LoginUser loginUser){
		return loginUserMapper.insertSelective(loginUser);
	}

	public int login(loginUserId) {
		return  loginUserMapper.selectByPrimaryKey(loginUserId);
	}

}
