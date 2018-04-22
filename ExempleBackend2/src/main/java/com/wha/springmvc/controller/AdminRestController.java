package com.wha.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wha.springmvc.model.Agent;
import com.wha.springmvc.model.Client;
import com.wha.springmvc.service.AdminService;
import com.wha.springmvc.service.AgentService;
import com.wha.springmvc.service.ClientService;

@Controller
@RestController
public class AdminRestController
{
	/*
	@Autowired
	AdminService adminService;
	@Autowired
	AgentService agentService;
	@Autowired
	ClientService clientService;
	*/
	
	/**
	 * WS qui affecte un client cl à un agent ag
	 * 
	 * @param idCli id du client
	 * @param idAg id de l'agent
	 * 
	 * @return true si la transaction c'est bien passé
	 * @return false si la transaction c'est mal passé
	 * 
	 * @author Berenger
	 */
	/*
	@SuppressWarnings("unchecked")
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/affect/{idAgent}/{idClient}", method = RequestMethod.GET)
	public ResponseEntity<Boolean> affectClientWithAgent(@PathVariable("idClient") int idCli, @PathVariable("idAgent") int idAg) 
	{
		
		Boolean ok;
		Agent ag = agentService.findById(idAg);
		Client cl = clientService.findById(idAg);
		
		//Pas de client ou pas d'agent
		if(ag == null || cl == null)
		{
			ok = false;
			return new ResponseEntity<Boolean>(ok, HttpStatus.OK);
		}
		else
		{
			
			adminService.assignClientToAgent(cl, ag);
			ok = true;
			return new ResponseEntity<Boolean>(ok, HttpStatus.OK);
		}
	}
	*/
	
}
