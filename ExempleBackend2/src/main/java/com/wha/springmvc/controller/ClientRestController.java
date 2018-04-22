package com.wha.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.wha.springmvc.model.Agent;
import com.wha.springmvc.model.Client;
import com.wha.springmvc.model.CompteBanquaire;
import com.wha.springmvc.model.Demande;
import com.wha.springmvc.model.User;
import com.wha.springmvc.service.ClientService;
import com.wha.springmvc.service.UserService;

@RestController
public class ClientRestController
{

	@Autowired
	ClientService clientService;


	/**
	 * cette methode permet d'afficher un client avec ses details
	 * 
	 * @param :idclient
	 * @return cli
	 * @author Mathilde
	 * 
	 */
	@SuppressWarnings("unchecked")
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/client/{idclient}", method = RequestMethod.GET)

	public ResponseEntity<Client> viewDetails(@PathVariable("idclient") int idcl) {

		Client cli = clientService.findById(idcl);
		if (cli == null) {
			// System.out.println("Client with id " + idcl + " not found");
			return new ResponseEntity<Client>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<Client>(cli, HttpStatus.OK);

	}

}
