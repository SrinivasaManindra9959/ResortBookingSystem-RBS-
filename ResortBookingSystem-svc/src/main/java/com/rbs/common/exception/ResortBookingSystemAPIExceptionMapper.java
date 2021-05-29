package com.rbs.common.exception;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ResortBookingSystemAPIExceptionMapper  implements ExceptionMapper<Throwable>{

	@SuppressWarnings("static-access")
	@Override
	public Response toResponse(Throwable exception) {

		if(exception instanceof ValidationException) {
			return Response.status(500).entity(exception.getMessage()).type(MediaType.APPLICATION_JSON).build();
		}
		else {
			
			return Response.serverError().entity(getInternalServerError()).type(MediaType.APPLICATION_JSON).build();
		}
	}
	
	private List<Error> getInternalServerError(){
		return Arrays.asList(new Error("BOO1", "VALIDATION ERROR", "Contact Applocation Error"));
	}

}
