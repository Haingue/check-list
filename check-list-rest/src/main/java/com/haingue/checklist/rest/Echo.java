package com.haingue.checklist.rest;

import javax.ws.rs.Path;
import javax.ws.rs.GET;

@Path("application/echo")
public class Echo {

	@GET
	public String getEcho() {
		return "echo ! echo ! echo !";
	}
	
}
