package org.jfcmc.sprstahere.chap11.payments.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import java.util.UUID;
import java.util.logging.Logger;
import org.jfcmc.sprstahere.chap11.payments.model.Payment;

@RestController
public class PaymentsController {

    private Logger logger =
        Logger.getLogger(PaymentsController.class.getName());

    @PostMapping("/payment")
    public ResponseEntity<Payment>
        createPayment(@RequestHeader String requestId,
                      @RequestBody Payment payment) {
        logger.info("Received Request with ID " + requestId +
                    " ;Payment Amount: " + payment.getAmount());
        payment.setId(UUID.randomUUID().toString());

        return ResponseEntity
            .status(HttpStatus.OK)
            .header("requestId", requestId)
            .body(payment);
    }
}
