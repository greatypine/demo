package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.master.SchoolMapper;

@Service("schoolService")
public class SchoolService {

	@Autowired
	SchoolMapper schoolDao;
	
	public String querySchoolInfo(String id) {
		return schoolDao.querySchoolInfo(id);
	}
	
}
