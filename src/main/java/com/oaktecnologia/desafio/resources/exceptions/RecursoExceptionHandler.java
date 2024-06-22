package com.oaktecnologia.desafio.resources.exceptions;


import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.oaktecnologia.desafio.services.exceptions.RecursoNaoEncontrado;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class RecursoExceptionHandler {
	
	public ResponseEntity<StandartError> recursoNaoEncontrado(RecursoNaoEncontrado e,HttpServletRequest request){
		String error = "Produto não encontrado";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandartError objError = new StandartError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		
		return ResponseEntity.status(status).body(objError);
	}

}
