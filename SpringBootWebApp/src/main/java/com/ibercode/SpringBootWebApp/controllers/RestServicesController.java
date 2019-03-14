package com.ibercode.SpringBootWebApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibercode.SpringBootWebApp.razvan.ManagerService;

@RestController
public class RestServicesController {
	
	/**
	 * Add Here CRUD for RestServices
	 */
    
    @Autowired
    private ManagerService managerService;

    @GetMapping(path = "ws")
    public String getRest() {
	
	managerService.getAllManagers();
	return "getrest";
    }
    

    @PostMapping(path = "ws")
    public String postRest() {
	return "postrest";
    }
    
    
}
