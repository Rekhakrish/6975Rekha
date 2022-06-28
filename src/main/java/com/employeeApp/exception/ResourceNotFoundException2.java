package com.employeeApp.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor

@ToString
public class ResourceNotFoundException2 extends RuntimeException
{
	public ResourceNotFoundException2(String resourceName, String fieldName, int fieldValue) {
		super(String.format("%s not found with is %s: %s", resourceName,fieldName,fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	private String resourceName;
	private String fieldName;
	private int fieldValue;

}
