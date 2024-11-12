package com.example.User.Service;

import com.example.User.Modules.User;
import com.example.User.Modules.Userrole;
import com.example.User.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    public UserRepository repository;

    public List<User> getAllUser() {
        return repository.findAll();
    }

    public String insertUser(User user) {

        user.setCreatedOn(LocalDate.now());
        user.setUserrole(Userrole.SELLER);
        repository.save(user);
        return "User save";
    }


    public String deleteUser(long id){
        repository.deleteById(id);
        return "deleted";
    }
}
