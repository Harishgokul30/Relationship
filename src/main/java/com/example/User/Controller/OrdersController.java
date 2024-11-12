package com.example.User.Controller;

import com.example.User.Modules.Cart;
import com.example.User.Modules.Orders;
import com.example.User.Service.CartService;
import com.example.User.Service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    public OrdersService service;

    @GetMapping
    public List<Orders> get(){
        return service.getOrder();
    }
    @PostMapping
    public String save(@RequestBody Orders orders){
        return service.insertOrder(orders);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable long id){
        return service.delete(id);
    }
}
