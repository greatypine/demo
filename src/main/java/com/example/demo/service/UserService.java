package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.slave.UserMapper;

@Service("userService")
public class UserService {

	@Autowired
	UserMapper userDao;
	
	public String queryUserInfo(String id) {
		return userDao.queryUserInfo(id);
	}
	
}
