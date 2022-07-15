package com.flyaway.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.flyaway.dao.AdminDao;
import com.flyaway.model.Admin;

public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao adminDao;

	@Override
	public Admin validateAdmin(Admin login) {
		return adminDao.validateAdmin(login);
	}

	public int UpdatePassword(Admin update) {

		if(!update.getNewpassword().equals(update.getConfirmpassword())) {
			System.out.println("Both password does not match.");
		}

//		if(update.getNewpassword().equals(update.getPassword())) {
//			System.out.println("New and old password can not be same!");
//		}

		return adminDao.UpdatePassword(update);
	}


}
