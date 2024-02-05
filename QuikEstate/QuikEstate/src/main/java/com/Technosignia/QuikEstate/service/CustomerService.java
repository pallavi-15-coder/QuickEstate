package com.Technosignia.QuikEstate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Technosignia.QuikEstate.entity.Customer;
import com.Technosignia.QuikEstate.repository.CustomerRepository;
@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerrepository;

	public Customer Createcustomerdetails(Customer customer) {
		return customerrepository.save(customer);
	}

	public List<Customer> finalAllCustomer() {
		return customerrepository.findAll();
	}

	public Optional<Customer> findcustomerdetailsById(Long id) {
		return customerrepository.findById(id);
	}

	public String deleteCustomerById(Long id) {
		customerrepository.deleteById(id);
		return "Customer deleted successfully!";
	}

	public Customer updateCustomerdetails(Customer customer) {
		return customerrepository.save(customer);
	}

	

}
