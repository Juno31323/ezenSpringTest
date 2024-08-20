package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason = "객체 없어요")
public class PakchimException extends Exception {

	public PakchimException(String msg) {
		super(msg);
	}
	
	
	
}
