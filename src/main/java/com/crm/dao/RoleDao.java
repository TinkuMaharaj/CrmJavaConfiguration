package com.crm.dao;

import com.crm.entity.Role;

public interface RoleDao {
	
	public Role findRoleByName(String theRoleName);
}
