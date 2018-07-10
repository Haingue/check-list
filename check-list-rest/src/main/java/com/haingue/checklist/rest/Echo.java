package com.haingue.checklist.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("echo")
public class Echo {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	//@Path("{text}")
	public String doEcho(@QueryParam("text") String text) {
		return "Echo:\t" + text;
	}

}
