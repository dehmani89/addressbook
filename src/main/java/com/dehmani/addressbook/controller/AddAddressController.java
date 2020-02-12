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
public class AddAddressController {

    @Autowired
    AddressRepository addressRepository;

    @PostMapping("/insert/address")
    public Address createAddress(@Valid @RequestBody Address address) {
        return addressRepository.save(address);
    }

}
