package com.rbs.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonObjectMapperConvert {

	public static String JsonObjectConverter(Object object) {
		
		try {
			return new ObjectMapper().writeValueAsString( object);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return " ";
	}
	
	

}
