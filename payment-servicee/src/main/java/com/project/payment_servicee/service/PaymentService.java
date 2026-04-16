package com.project.payment_servicee.service;

import com.project.payment_servicee.model.PaymentModel;
import com.project.payment_servicee.repo.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepo paymentRepo;

    public PaymentModel doPayment(PaymentModel paymentModel) {
        paymentModel.setPaymentStatus("SUCCESS");
        return paymentRepo.save(paymentModel);
    }

    public List<PaymentModel> findAllPayments() {
        return paymentRepo.findAll();
    }

    public PaymentModel findPaymentByOrderId(Long orderId) {
        return paymentRepo.findByOrderId(orderId);
    }
}
