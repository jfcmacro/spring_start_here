package org.jfcmc.sprstahere.chap11.payment.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.jfcmc.sprstahere.chap11.payment.model.Payment;
import org.jfcmc.sprstahere.chap11.payment.proxy.PaymentsProxy;

@RestController
public class PaymentsController {

    private final PaymentsProxy paymentsProxy;

    public PaymentsController(PaymentsProxy paymentsProxy) {
        this.paymentsProxy = paymentsProxy;
    }

    @PostMapping("/payment")
    public Payment createPayment(@RequestBody Payment payment) {
        return paymentsProxy.createPayment(payment);
    }
}
