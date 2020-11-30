package com.jortega.api.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jortega.api.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
