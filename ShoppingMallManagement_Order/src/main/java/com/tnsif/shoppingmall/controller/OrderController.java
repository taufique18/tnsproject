package com.tnsif.shoppingmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.shoppingmall.entity.Order;
import com.tnsif.shoppingmall.repository.OrderRepository;

@RestController
@RequestMapping("/orders")
public class OrderController {
	@Autowired
	private OrderRepository orderRepo;

	@GetMapping("/{id}")
	public Order getOrderById(@PathVariable Long id) {
		return orderRepo.findById(id).get();
	}

	@GetMapping
	public List<Order> getAllOrders() {
		return orderRepo.findAll();
	}

	@PostMapping
	public Order createOrder(@RequestBody Order order) {
		return orderRepo.save(order);
	}

	@PutMapping("/{id}")
	public void updateOrder(@PathVariable Long id, @RequestBody Order order) {

		order.setId(id);
		orderRepo.save(order);

	}

	@DeleteMapping("/{id}")
	public void deleteOrderById(@PathVariable Long id) {
		orderRepo.deleteById(id);
	}
}
