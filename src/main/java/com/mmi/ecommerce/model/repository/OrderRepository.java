package com.mmi.ecommerce.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mmi.ecommerce.model.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> 
{
	

}
