package com.upb.webapp;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.upb.service.StudentService;

@Path("/estudiantes")
public class StudentWebapp {
	private static StudentService Service = new StudentService();
	
	@GET()
	public String getList() {
		return Service.list();
	}


}
