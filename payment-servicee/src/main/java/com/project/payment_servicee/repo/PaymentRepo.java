package com.project.payment_servicee.repo;

import com.project.payment_servicee.model.PaymentModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepo extends JpaRepository<PaymentModel, Long> {

    public PaymentModel findByOrderId(Long orderId);
}
