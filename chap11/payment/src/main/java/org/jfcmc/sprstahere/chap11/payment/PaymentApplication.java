package org.jfcmc.sprstahere.chap11.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
// @EnableFeignClients(basePackages = "org.jfcmc.sprstahere.chap11.payment.proxy")
@EnableFeignClients
public class PaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class, args);
    }

}
