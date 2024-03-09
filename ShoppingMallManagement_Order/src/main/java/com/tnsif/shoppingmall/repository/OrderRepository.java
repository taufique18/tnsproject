package com.tnsif.shoppingmall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.shoppingmall.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
