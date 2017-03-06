package com.zh.service;

import java.util.Map;

public interface LoginService {

	public Map<String,Object> checkLoginInfo(String username,String password);
}
