package com.jortega.api.endpoints;

import org.springframework.web.bind.annotation.RestController;

import com.jortega.api.database.CustomerRepository;
import com.jortega.api.exceptions.NonUniqueValueException;
import com.jortega.api.exceptions.NotFoundException;
import com.jortega.api.exceptions.NullValueException;
import com.jortega.api.model.Customer;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {
	
	private final CustomerRepository repository;
	
	CustomerController(CustomerRepository repository){
		this.repository = repository;
	}
	
	@PostMapping("/customers")
    @ResponseStatus( HttpStatus.CREATED )
    Customer newCustomer(@RequestBody Customer newCustomer) {
        try {
            return repository.save(newCustomer);
        } catch (Exception e) {
            if (newCustomer.getCustomerId() == null) { throw new NullValueException("customerId"); }
            throw new NonUniqueValueException("customerId", newCustomer.getCustomerId());
        }
    }
	
	@GetMapping("/customers/{id}")
	Customer one(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("cliente", "id", id.toString()));
	}
	
	@GetMapping("/customers")
    List<Customer> all() {
        return repository.findAll();
    }
}
