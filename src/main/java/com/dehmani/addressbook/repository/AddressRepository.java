package com.dehmani.addressbook.repository;

import com.dehmani.addressbook.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Amine Dehmani on 2/7/2020.
 */

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}



