package org.jfcmc.sprstahere.chap10.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import org.jfcmc.sprstahere.chap10.model.PaymentDetails;
import org.jfcmc.sprstahere.chap10.util.ErrorDetails;
import org.jfcmc.sprstahere.chap10.util.NotEnoughMoneyException;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler() {
	ErrorDetails errorDetails = new ErrorDetails();
	errorDetails.setMessage("Not enough money to make the payment");
	return ResponseEntity
	    .badRequest()
	    .body(errorDetails);
    }
}
