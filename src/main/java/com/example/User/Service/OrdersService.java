package com.example.User.Service;

import com.example.User.Modules.Cart;
import com.example.User.Modules.Orders;
import com.example.User.Repository.CartRepository;
import com.example.User.Repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class OrdersService {
    @Autowired

    public OrdersRepository repository;

    public List<Orders> getOrder(){
        return repository.findAll();
    }
    public String insertOrder(Orders orders){
        orders.setCreatedOn(LocalDate.now());
        repository.save(orders);
        return "Orders added";
    }
    public String delete(long id){
        repository.deleteById(id);
        return "Deleted";
    }
}
