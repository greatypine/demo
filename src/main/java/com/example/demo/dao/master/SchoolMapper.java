package com.example.demo.dao.master;

import org.springframework.stereotype.Repository;

@Repository
public interface SchoolMapper {

	String querySchoolInfo(String id);
	
}
