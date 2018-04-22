package com.wha.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wha.springmvc.model.Agent;
import com.wha.springmvc.model.Client;
import com.wha.springmvc.model.CompteBanquaire;
import com.wha.springmvc.service.AgentService;
import com.wha.springmvc.service.ClientService;

@Controller
@RestController
public class AgentRestController {

	@Autowired
	AgentService agentService;
	ClientService clientService;
	// ClientService clientService;

	/**
	 * Cette methode permet d'envoyer la liste des clients rattaché à un agent
	 * 
	 * @param idAg
	 *            : id de l'agent
	 * @return List<Client>
	 * @author Alexandra, Berenger, Mathilde, wajih
	 */
	@SuppressWarnings("unchecked")
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/agent/{idAgent}/clients", method = RequestMethod.GET)
	public ResponseEntity<List<Client>> searchClient(@PathVariable("idAgent") int idAg) {

		List<Client> clients = new ArrayList<Client>();
		Agent ag = agentService.findById(idAg);
		if (ag == null) {
			return new ResponseEntity<List<Client>>(HttpStatus.NO_CONTENT);
		} else {
			clients = (List<Client>) (Object) ag.getClients();
		}
		return new ResponseEntity<List<Client>>(clients, HttpStatus.OK);

	}
	
}
    

