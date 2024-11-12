package com.example.User.Service;

import com.example.User.Modules.Category;
import com.example.User.Modules.Products;
import com.example.User.Repository.CategoryRepository;
import com.example.User.Repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProductsService {
    @Autowired
    public ProductsRepository repository;

    public List<Products>products(){
        return repository.findAll();
    }
    public String insertProducts(Products products){
        products.setCreatedOn(LocalDate.now());
        repository.save(products);
        return "Products added";
    }
    public String delete(long id){
        repository.deleteById(id);
        return "Deleted";
    }
}
