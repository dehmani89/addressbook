package com.dehmani.addressbook.controller;

import com.dehmani.addressbook.exception.ResourceNotFoundException;
import com.dehmani.addressbook.model.Address;
import com.dehmani.addressbook.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Amine Dehmani on 2/7/2020.
 */
@RestController
@RequestMapping("/api")
public class SelectAddressController {

    @Autowired
    AddressRepository addressRepository;

    @GetMapping("/select/address")
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    @GetMapping("/select/address/{id}")
    public Address getAddressById(@PathVariable(value = "id") Long addressId) {
        return addressRepository.findById(addressId)
                .orElseThrow(() -> new ResourceNotFoundException("Address", "id", addressId));
    }

    @GetMapping("/select/address/username/{username}")
    public List<Address> getAddressByUsername(@PathVariable(value = "username") String username) {
        List<Address> isAddressExist = null;
        return addressRepository.findByUsername(username);

       /* if(isAddressExist.size() == 0){
            System.out.println("User Address doesn't Exist, Insert");
            return addressRepository.findByUsername(username);
        }else{
            System.out.println("User Address Exist, Let the client know to pick a new username");
            new ResourceNotFoundException("Address", "username", username);
        }*/
    }


}
