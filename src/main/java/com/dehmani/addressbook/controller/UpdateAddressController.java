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
public class UpdateAddressController {

    @Autowired
    AddressRepository addressRepository;

    @PutMapping("/update/address/{id}")
    public Address updateAddress(@PathVariable(value = "id") Long addressId, @Valid @RequestBody Address addressDetails) {

        Address address = addressRepository.findById(addressId)
                .orElseThrow(() -> new ResourceNotFoundException("Address", "id", addressId));

        address.setUsername(addressDetails.getUsername());
        address.setStreet(addressDetails.getStreet());
        address.setCity(addressDetails.getCity());
        address.setState(addressDetails.getState());
        address.setZip(addressDetails.getZip());

        Address updatedAddress = addressRepository.save(address);
        return updatedAddress;
    }
}
