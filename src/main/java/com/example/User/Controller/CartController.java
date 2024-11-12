package com.example.User.Controller;

import com.example.User.Modules.Cart;
import com.example.User.Modules.CartItem;
import com.example.User.Service.CartItemService;
import com.example.User.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    public CartService service;

    @GetMapping
    public List<Cart> get(){
        return service.getCart();
    }
    @PostMapping
    public String save(@RequestBody Cart cart){
        return service.insertItem(cart);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable long id){
        return service.delete(id);
    }
}
