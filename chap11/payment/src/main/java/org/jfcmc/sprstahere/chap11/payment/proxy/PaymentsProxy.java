package org.jfcmc.sprstahere.chap11.payment.proxy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import org.jfcmc.sprstahere.chap11.payment.model.Payment;

@Component
public class PaymentsProxy {
    private final WebClient webClient;

    @Value("${name.service.url}")
    private String url;

    public PaymentsProxy(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<Payment> createPayment(String requestId,
                                       Payment payment) {
        return webClient
            .post()
            .uri(url + "/payment")
            .header("requestId", requestId)
            .body(Mono.just(payment), Payment.class)
            .retrieve()
            .bodyToMono(Payment.class);
    }
}
