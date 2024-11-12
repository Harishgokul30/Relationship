package com.example.User.Service;

import com.example.User.Modules.Category;
import com.example.User.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    public CategoryRepository repository;

    public List<Category> getAllCategory(){
        return repository.findAll();
    }
    public String insertCategory(Category category){
        category.setCreatedOn(LocalDate.now());
        repository.save(category);
        return "Category added";
    }
    public String delete(long id){
        repository.deleteById(id);
        return "Deleted";
    }
}
