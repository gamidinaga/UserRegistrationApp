package com.restfull.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/student")
public class StudentRestController {

	@GET
	@Path("/stdList")
	public String getStudentList() {
		return null;
	}
	@GET
	@Path("/stdById")
	public String getStudentById(@QueryParam("sId") int id) {
		return null;
	}
	@POST
	@Path("/createStd")
	public String createNewStudent() {
		return null;
	}
	@POST
	@Path("/updateStd")
	public String updateStudent(@QueryParam("sId") int id) {
		return null;
	}
	
	@GET
	@Path("/deleteStd")
	public String deleteStudent(@QueryParam("sId") int id) {
		return null;
	}
}
