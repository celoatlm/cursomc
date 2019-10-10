package com.example.cursomc.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.cursomc.services.excption.ObjectNotFoundException;

public class ResourceExceptionHandler {

	
	@ExceptionHandler(ObjectNotFoundException.class)
	private ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e , HttpServletRequest request){
		
		
		StandardError error = new StandardError(HttpStatus.NOT_FOUND.value(), 
				e.getMessage(), 
				System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
		
		
	}
	
}
