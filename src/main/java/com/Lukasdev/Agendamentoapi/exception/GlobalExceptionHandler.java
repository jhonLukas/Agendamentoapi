package com.Lukasdev.Agendamentoapi.exception;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import Exceptions.ErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleAll(Exception ex) {
	    return ResponseEntity.status(400)
	            .body(new ErrorResponse("Erro capturado: " + ex.getMessage()));
	}
}