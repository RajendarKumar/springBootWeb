/**
 * 
 */
package com.raj.controller.impl;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.controller.api.IController;

/**
 * @author admin
 *
 */
@RestController
@EnableAutoConfiguration
public class Controller implements IController{

	@Override
	@RequestMapping("/hello")
	public String helloWord() {
		return "{value : hello World}";
	}

	
}
