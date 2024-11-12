package com.example.User.Controller;

import com.example.User.Modules.Address;
import com.example.User.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    public AddressService service;

    @GetMapping
    public List<Address> getall(){
        return service.getAllAddress();
    }
    @PostMapping
    public String save(@RequestBody Address address){
        return service.insertAddress(address);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable long id){
        return service.delete(id);
    }
}
