package com.example.demo.dao.slave;

import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

	String queryUserInfo(String id);

}
