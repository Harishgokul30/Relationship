package com.example.User.Service;

import com.example.User.Modules.Cart;
import com.example.User.Modules.CartItem;
import com.example.User.Repository.CartItemRepository;
import com.example.User.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CartService {
    @Autowired

    public CartRepository repository;

    public List<Cart> getCart(){
        return repository.findAll();
    }
    public String insertItem(Cart cart){
        cart.setCreatedOn(LocalDate.now());
        repository.save(cart);
        return "cart added";
    }
    public String delete(long id){
        repository.deleteById(id);
        return "Deleted";
    }
}
