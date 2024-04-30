package org.jfcmc.sprstahere.chap10.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import org.jfcmc.sprstahere.chap10.model.PaymentDetails;
import org.jfcmc.sprstahere.chap10.service.PaymentService;
import org.jfcmc.sprstahere.chap10.util.ErrorDetails;
import org.jfcmc.sprstahere.chap10.util.NotEnoughMoneyException;

@RestController
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
	this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<?> makePayment() {
	try {
	    PaymentDetails paymentDetails =
		paymentService.processPayment();
	    return ResponseEntity
		.status(HttpStatus.ACCEPTED)
		.body(paymentDetails);
	}
	catch (NotEnoughMoneyException e) {
	    ErrorDetails errorDetails = new ErrorDetails();
	    errorDetails.setMessage("Not enough money to make the payment");
	    return ResponseEntity
		.badRequest()
		.body(errorDetails);
	}
    }
}
