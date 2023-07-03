package com.jenkins.jenkinsapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

	@GetMapping("run")
	public String runApp() {
		return "Jinkins app is working!!!";
	}
	
	@GetMapping("show")
	public String show() {
		return "welcome bro!!!";
	}
}
