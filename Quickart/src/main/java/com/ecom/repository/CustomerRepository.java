package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.models.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>{

}
