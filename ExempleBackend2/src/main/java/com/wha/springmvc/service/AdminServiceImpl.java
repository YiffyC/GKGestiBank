package com.wha.springmvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.wha.springmvc.dao.AdminDAO;
import com.wha.springmvc.dao.AgentDAO;
import com.wha.springmvc.model.Admin;
import com.wha.springmvc.model.Agent;
import com.wha.springmvc.model.Client;

@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService
{

	@Override
	public Admin findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAdminById(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Admin> findAllAdmins() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllAdmins() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isUserExist(Admin admin) {
		// TODO Auto-generated method stub
		return false;
	}
	/*
	@Autowired
	AdminDAO adminDao;
	@Autowired
	AgentDAO agentDao;
	
	
	@Override
	public Admin findById(int id)
	{
		return adminDao.findById(id);
	}

	@Override
	public Admin findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveAdmin(Admin admin) 
	{
		adminDao.save(admin);
		
	}

	@Override
	public void updateAdmin(Admin admin)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAdminById(long id)
	{
		
	}

	@Override
	public List<Admin> findAllAdmins() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllAdmins() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isUserExist(Admin admin) {
		return (Boolean) null;
	}
	*/
	
	/**
	 * Permet d'ajouter un client c à la liste des clients de l'agent a
	 * 
	 * @author Berenger
	 */
	/*
	@Override
	public void assignClientToAgent(Client c, Agent a)
	{
		Agent agent =  agentDao.findById(a.getId());
		agent.getClients().add(c);
		agentDao.save(agent);
		
	}
	*/

	
}
