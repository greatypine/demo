package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.SchoolService;
import com.example.demo.service.UserService;

@RestController
@ResponseBody
public class TestController {

	@Autowired
	SchoolService schoolService;
	@Autowired
	UserService userService;
	
	@RequestMapping(value="test/aa/")
	public void testController() {
		System.out.println(schoolService.querySchoolInfo("1"));
		System.out.println(userService.queryUserInfo("1"));
	}
	
}
