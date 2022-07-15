package com.flyaway.dao;

import com.flyaway.model.Admin;

public interface AdminDao {

	public Admin validateAdmin(Admin login);

	public int UpdatePassword(Admin update);

}


