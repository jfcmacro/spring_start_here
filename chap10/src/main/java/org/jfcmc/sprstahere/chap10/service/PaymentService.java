package org.jfcmc.sprstahere.chap10.service;

import org.springframework.stereotype.Service;

import org.jfcmc.sprstahere.chap10.util.NotEnoughMoneyException;
import org.jfcmc.sprstahere.chap10.model.PaymentDetails;

@Service
public class PaymentService {
    public PaymentDetails processPayment() {
	throw new NotEnoughMoneyException();
    }
}
