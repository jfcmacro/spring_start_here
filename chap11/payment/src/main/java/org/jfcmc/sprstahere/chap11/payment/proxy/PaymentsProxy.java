package org.jfcmc.sprstahere.chap11.payment.proxy;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.jfcmc.sprstahere.chap11.payment.model.Payment;
import java.util.UUID;

@Component
public class PaymentsProxy {
    private final RestTemplate restTemplate;

    @Value("${name.service.url}")
    private String paymentsServiceUrl;

    // @Autowired
    public PaymentsProxy(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Payment createPayment(Payment payment) {
        String url = paymentsServiceUrl + "/payment";

        HttpHeaders headers = new HttpHeaders();

        headers.add("requestId",
                    UUID.randomUUID().toString());

        HttpEntity<Payment> httpEntity =
            new HttpEntity<>(payment, headers);

        ResponseEntity<Payment> response =
            restTemplate.exchange(url,
                                  HttpMethod.POST,
                                  httpEntity,
                                  Payment.class);

        return response.getBody();
    }
}
