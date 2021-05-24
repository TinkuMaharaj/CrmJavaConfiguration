package com.crm.dao;

import com.crm.entity.User;

public interface UserDao {
	
	User findByUserName(String userName);
    
    void save(User user);

}
