package com.infolake.customer.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infolake.customer.service.Customer;
import com.infolake.customer.service.CustomerService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(CustomerController.REST)
public class CustomerController {
	
	private static Logger logger = LoggerFactory.getLogger(CustomerService.class);
	public static final String REST="/rest" ;
	
	@Autowired
	private CustomerService customerService;
 
    @RequestMapping("/customer/list")
    public List<Customer> getCustomers() {
        
        return customerService.getCustomers();
    }
    
    
    @RequestMapping(value = "/customer/{customerId}")
    public Customer getCustomerById(@PathVariable("customerId") Integer customerId) {
    	logger.info("Get Customer by Id : "+ customerId);
        return customerService.getCustomerById(customerId);
    }

}
	


