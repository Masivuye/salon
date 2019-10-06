package com.salon.controller.ordersController;

import com.salon.domain.orders.Order;
import com.salon.repositories.ordersRepository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/salon/order")
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @GetMapping(value = "/all")
    public List<Order> getAll(){
        return orderRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<Order> persist(@RequestBody final Order order){
        orderRepository.save(order);
        return orderRepository.findAll();
    }
}
