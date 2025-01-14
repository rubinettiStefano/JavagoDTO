package com.generation.javago.controller.exception;

public class EntityNotFoundException extends RuntimeException
{
	public EntityNotFoundException(String message)
	{
		super(message);
	}
}
