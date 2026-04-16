package com.project.order_servicee.service;

import com.project.order_servicee.PaymentDTO.Payment;
import com.project.order_servicee.model.OrderModel;
import com.project.order_servicee.repo.OrderRepo;
import jakarta.persistence.criteria.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.apache.logging.log4j.util.StringBuilders.equalsIgnoreCase;

@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    PaymentClient paymentClient;

    public OrderModel save(OrderModel orderModel) {
        orderModel.setStatus("PLACED");
        OrderModel savedOrder = orderRepo.save(orderModel);
        Payment payment = new Payment();
        payment.setOrderId(savedOrder.getId());
        payment.setAmount(savedOrder.getPrice());

        try{
            Payment paymentResponse = paymentClient.makePayment(payment);
            if("SUCCESS".equalsIgnoreCase(paymentResponse.getPaymentStatus())){
                savedOrder.setStatus("PAID");
            }
            else{
                savedOrder.setStatus("FAILED");
            }
        }
        catch(Exception e){
            savedOrder.setStatus("FAILED");
        }
        return savedOrder;
    }

    public List<OrderModel> getAllOrders() {
        return orderRepo.findAll();
    }

}
