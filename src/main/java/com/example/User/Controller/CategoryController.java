package com.example.User.Controller;

import com.example.User.Modules.Category;
import com.example.User.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    public CategoryService service;

    @GetMapping
    public List<Category> get(){
        return service.getAllCategory();
    }
    @PostMapping
    public String saveCategory(@RequestBody Category category){
        return service.insertCategory(category);
    }
    @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable long id){
        return service.delete(id);
    }
}
