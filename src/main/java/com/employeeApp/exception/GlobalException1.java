package com.employeeApp.exception;

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
		String message=ex.getMessage();
		ApiResponse1 response=new ApiResponse1(message,false);
		return new ResponseEntity<ApiResponse1>(response,HttpStatus.NOT_FOUND);
   }
}
