package com.project.payment_servicee.controller;

import com.project.payment_servicee.model.PaymentModel;
import com.project.payment_servicee.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/makepayments")
    public PaymentModel makePayment(@RequestBody PaymentModel payment) {
        payment.setPaymentStatus("SUCCESS");
        return paymentService.doPayment(payment);
    }

    @GetMapping("/order/{orderId}")
    public ResponseEntity<PaymentModel> getByOrderId(@PathVariable Long orderId) {
        return ResponseEntity.ok(paymentService.findPaymentByOrderId(orderId));
    }

    @GetMapping("/getMappings")
    public ResponseEntity<List<PaymentModel>> getAllPayments() {
        return ResponseEntity.ok(paymentService.findAllPayments());
    }
}
