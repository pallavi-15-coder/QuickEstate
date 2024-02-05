package com.Technosignia.QuikEstate.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.Technosignia.QuikEstate.entity.Customer;
import com.Technosignia.QuikEstate.service.CustomerService;

@RestController
public class CustomerController {
     @Autowired
     CustomerService customerservice;
     
	@PostMapping("/customer")
	public Customer CreateCustomerDetails(@RequestBody Customer customer) {
		return customerservice.Createcustomerdetails(customer);
		
	}
	@GetMapping("/customer")
	public List<Customer> finalAllCustomer(){
	return customerservice.finalAllCustomer();
	}
	
	@GetMapping("/customer/{id}")
	public Optional<Customer>findCustomerDetailsById(@PathVariable Long id){
		return customerservice.findcustomerdetailsById(id);
		
	}
	@DeleteMapping("/customer")
	public  String deleteCustomerDetailsById(@RequestParam Long id) {
		return customerservice.deleteCustomerById(id);
	}

		@PutMapping("/customer/{id}")
		public Customer UpdateCustomerdetails(@RequestBody Customer customer) {
			return customerservice.updateCustomerdetails(customer);
			
		}


}
