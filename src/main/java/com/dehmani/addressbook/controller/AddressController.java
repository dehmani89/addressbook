/*
package com.dehmani.addressbook.controller;

import com.dehmani.addressbook.exception.ResourceNotFoundException;
import com.dehmani.addressbook.model.Address;
import com.dehmani.addressbook.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

*/
/**
 * Created by Amine Dehmani on 2/7/2020.
 *//*

@RestController
@RequestMapping("/api")
public class AddressController {

    @Autowired
    AddressRepository addressRepository;

    @GetMapping("/address")
    public List<Address> getAllNotes() {
        return addressRepository.findAll();
    }

    @PostMapping("/address")
    public Address createAddress(@Valid @RequestBody Address address) {
        return addressRepository.save(address);
    }

    @GetMapping("/address/{id}")
    public Address getNoteById(@PathVariable(value = "id") Long addressId) {
        return addressRepository.findById(addressId)
                .orElseThrow(() -> new ResourceNotFoundException("Address", "id", addressId));
    }

    @PutMapping("/address/{id}")
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

    @DeleteMapping("/address/{id}")
    public ResponseEntity<?> deleteAddress(@PathVariable(value = "id") Long addressId) {
        Address address = addressRepository.findById(addressId)
                .orElseThrow(() -> new ResourceNotFoundException("Address", "id", addressId));

        addressRepository.delete(address);
        return ResponseEntity.ok().build();
    }
}
*/
