package com.crm.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.crm.entity.User;
import com.crm.user.CrmUser;

public interface UserService extends UserDetailsService {

    User findByUserName(String userName);

    void save(CrmUser crmUser);
}
