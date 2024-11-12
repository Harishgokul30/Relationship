package com.example.User.Controller;

import com.example.User.Modules.CartItem;
import com.example.User.Modules.Products;
import com.example.User.Service.CartItemService;
import com.example.User.Service.CategoryService;
import com.example.User.Service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/cartitem")

public class CartItemController {
    @Autowired
    public CartItemService service;

    @GetMapping
    public List<CartItem> get(){
        return service.getItem();
    }
    @PostMapping
    public String save(@RequestBody CartItem cartItem){
        return service.insertItem(cartItem);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable long id){
        return service.delete(id);
    }
}
