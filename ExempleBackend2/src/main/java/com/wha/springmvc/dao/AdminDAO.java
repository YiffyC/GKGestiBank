package com.wha.springmvc.dao;

import java.util.List;

import com.mysql.fabric.xmlrpc.Client;
import com.wha.springmvc.model.Admin;
import com.wha.springmvc.model.Agent;


public interface  AdminDAO 
{
	
	Admin findById(int id);

	Admin findByName(String name);

	void save( Admin admin );

	void deleteAdminById(int id);

	List<Admin> findAllAdmins();

	void deleteAllAdmins();

}