package com.siddhu.keycloak;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.keycloak.KeycloakPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SiddhuSpribgbootKeycloakController {


	@GetMapping("/public")
	public String getPublicResource(HttpServletRequest httpServletRequest)
	{
		return "This is public resource" + new Date().toString();
	}

	

	@GetMapping("/private")
	public String getPrivateResource(HttpServletRequest httpServletRequest)
	{
		//KeycloakPrincipal keycloakPrincipal = (KeycloakPrincipal) httpServletRequest.getUserPrincipal();
		return "This is private resource" + new Date().toString();
	}

}
