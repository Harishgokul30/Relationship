package com.example.User.Service;

import com.example.User.Modules.Address;
import com.example.User.Modules.AddressType;
import com.example.User.Modules.Userrole;
import com.example.User.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.parsers.SAXParser;
import java.time.LocalDate;
import java.util.List;

@Service
public class AddressService {
    @Autowired
    public AddressRepository repository;

    public List<Address>getAllAddress(){
        return repository.findAll();
    }
    public String insertAddress(Address address){
        address.setCreatedOn(LocalDate.now());
        address.setAddressType(AddressType.HOME);
        repository.save(address);
        return"Address saved";
    }
    public String delete(long id){
        repository.deleteById(id);
        return "deleted";
    }
}
