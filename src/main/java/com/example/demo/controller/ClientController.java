package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Client;

import com.example.demo.service.ClienttService;

@CrossOrigin("*")
@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	ClienttService clientservice;
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void saveUser(@RequestBody Client client) {
		clientservice.saveUser(client);
		
	}
	
	
	
}
