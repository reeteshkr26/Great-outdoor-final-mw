package com.cg.goris.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.goris.exception.RetailerInventoryException;

@RestControllerAdvice
public class ExceptionAdvice {

	@ExceptionHandler(RetailerInventoryException.class)
	public ResponseEntity<String> userExceptionHandler(RetailerInventoryException ex){
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> otherExceptionHandler(Exception ex){
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
