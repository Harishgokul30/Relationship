package com.example.User.Service;

import com.example.User.Modules.CartItem;
import com.example.User.Modules.Category;
import com.example.User.Repository.CartItemRepository;
import com.example.User.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CartItemService {
    @Autowired

    public CartItemRepository repository;

    public List<CartItem> getItem(){
        return repository.findAll();
    }
    public String insertItem(CartItem cartItem){
        cartItem.setCreatedOn(LocalDate.now());
        repository.save(cartItem);
        return "cartItem added";
    }
    public String delete(long id){
        repository.deleteById(id);
        return "Deleted";
    }
}
