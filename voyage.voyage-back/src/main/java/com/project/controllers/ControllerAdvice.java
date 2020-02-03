package com.project.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.project.ResourceNotFoundException;

@RestControllerAdvice
public class ControllerAdvice extends ResponseEntityExceptionHandler {

    private final static Logger LOGGER = LoggerFactory
	    .getLogger(ControllerAdvice.class);

    protected ControllerAdvice() {
	// TODO Auto-generated constructor stub
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    protected ResponseEntity<Object> handleResourceNotFoundException(
	    ResourceNotFoundException ex, WebRequest request) {
	LOGGER.debug("Logging... " + ex.getMessage());
	HttpHeaders headers = new HttpHeaders();
	HttpStatus status = HttpStatus.NOT_FOUND;
	return super.handleExceptionInternal(ex, null, headers, status,
		request);
    }
}
