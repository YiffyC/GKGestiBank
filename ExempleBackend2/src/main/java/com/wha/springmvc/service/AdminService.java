package com.wha.springmvc.service;

import java.util.List;

import com.wha.springmvc.model.Client;
import com.wha.springmvc.model.Admin;
import com.wha.springmvc.model.Agent;



public interface AdminService {
	
	Admin findById(int id);
	
	Admin findByName(String name);
	
	void saveAdmin(Admin admin);
	
	void updateAdmin(Admin admin);
	
	void deleteAdminById(long id);

	List<Admin> findAllAdmins(); 
	
	void deleteAllAdmins();
	
	public boolean isUserExist(Admin admin);

	//void assignClientToAgent(Client c, Agent a);
	
	
	
}
