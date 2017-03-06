package com.zh.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zh.dao.CommonDao;
import com.zh.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	CommonDao commonDao;
	
	public Map<String,Object> checkLoginInfo(String username,String password){
		System.out.println("username:"+username+",password:"+password);
		commonDao.insert();
		return null;
	}
}
