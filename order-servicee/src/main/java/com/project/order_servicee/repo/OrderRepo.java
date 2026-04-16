package com.project.order_servicee.repo;

import com.project.order_servicee.model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<OrderModel, Integer> {

}
