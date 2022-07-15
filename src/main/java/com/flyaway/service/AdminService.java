package com.flyaway.service;

import com.flyaway.model.Admin;

public interface AdminService {

  public Admin validateAdmin(Admin login);
  
  public int UpdatePassword(Admin update);
	 
}
