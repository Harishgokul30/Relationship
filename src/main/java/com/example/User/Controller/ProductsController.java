package com.example.User.Controller;

import com.example.User.Modules.Category;
import com.example.User.Modules.Products;
import com.example.User.Service.CategoryService;
import com.example.User.Service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {
    @Autowired
    public ProductsService service;

    @GetMapping
    public List<Products> getAllProducts(){
        return service.products();
    }
    @PostMapping
    public String save(@RequestBody Products products){
        return service.insertProducts(products);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable long id){
        return service.delete(id);
    }
}
