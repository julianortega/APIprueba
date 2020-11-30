package com.jortega.api.endpoints;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jortega.api.database.CustomerRepository;
import com.jortega.api.database.ProductRepository;
import com.jortega.api.exceptions.InvalidDateFormatException;
import com.jortega.api.exceptions.NotFoundException;
import com.jortega.api.model.Product;
import com.jortega.api.model.Customer;

@RestController
public class ProductController {

	private final ProductRepository repository;
    private final CustomerRepository customerRepository;
    String dateFormat = "yyyy-MM-dd HH:mm:ss";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
    
    public ProductController(ProductRepository repository, CustomerRepository customerRepository) {
    	this.repository = repository;
    	this.customerRepository = customerRepository;
	}
    
    @GetMapping("/products")
    List<Product> all() {
        List<Product> list = repository.findAll();
        return list;
    }
    
    @PostMapping("/products")
    @ResponseStatus(HttpStatus.CREATED)
    Product newProduct(@RequestBody Product newProduct) {
    	Customer customer = customerRepository.findById(newProduct.getCustomerId())
                .orElseThrow(() -> new NotFoundException("cliente", "id", String.valueOf(newProduct.getCustomerId())));
		
    	if (newProduct.getSoldAt() == null) {
            LocalDateTime date = LocalDateTime.now();
            newProduct.setSoldAt(date.format(formatter));
        }
    	
    	try{
            checkDateFormat(newProduct.getSoldAt());
        } catch (ParseException e) {
            throw new InvalidDateFormatException(newProduct.getSoldAt());
        }
    	
    	return repository.save(newProduct);
    }
    
    @GetMapping("/customers/{id}/products")
    List<Product> allByCustomer(@PathVariable Long id) {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("cliente", "id", id.toString()));
        List<Product> list = repository.findAll().stream().filter(car -> car.getCustomerId() == id).collect(Collectors.toList());
        return list;
    }
    
    
    private void checkDateFormat(String date) throws ParseException {
        if (date != null) {
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            formatter.setLenient(false);
            formatter.parse(date);
        }
    }
}
