/**
 * 
 */
package com.dxp.servicetemplate.servicetemplate.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class HelloWorldController {
	
	private static Logger log = LoggerFactory.getLogger(HelloWorldController.class);
	
	@Autowired
    private Environment env;
	
	@GetMapping(name="/getMessage")
	public String getMessage() {
		System.out.println(" #################### ");
		String message = env.getProperty("message");
		log.debug("sfdsdf {}", "sdfd");
		return message;
	}
}
