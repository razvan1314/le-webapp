package com.ibercode.SpringBootWebApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServicesController {

    @GetMapping(path = "ws")
    public String getRest() {
	return "getrest";
    }
}
