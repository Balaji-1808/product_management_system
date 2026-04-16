package com.project.order_servicee.service;

import com.project.order_servicee.PaymentDTO.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="payment-service")
public interface PaymentClient {

    @PostMapping("/payment/makepayments")
    public Payment makePayment(@RequestBody Payment payment);

}
