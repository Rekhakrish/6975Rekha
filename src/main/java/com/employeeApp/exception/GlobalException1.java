package com.employeeapp.exception;

import java.util.HashSet;
import java.util.Set;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException1 extends RuntimeException 
{
	@ExceptionHandler(ResourceNotFoundException2.class)
	ResponseEntity<ApiResponse1> resourceNotFoundException(ResourceNotFoundException2 ex) 
	{
		String message = ex.getMessage();
		ApiResponse1 response = new ApiResponse1(message, false);
		return new ResponseEntity<ApiResponse1>(response, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<Set<String>> constraintViolationException(ConstraintViolationException cve) 
	{
		Set<String> set = new HashSet<String>();
		cve.getConstraintViolations().forEach(constraint -> 
		{
			String message = constraint.getMessage();
			set.add(message);
		});
		return new ResponseEntity<Set<String>>(set, HttpStatus.BAD_REQUEST);

	}
}
