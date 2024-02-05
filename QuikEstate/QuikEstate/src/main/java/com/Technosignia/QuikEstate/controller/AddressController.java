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
import com.Technosignia.QuikEstate.entity.Address;
import com.Technosignia.QuikEstate.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	AddressService addressService;
	
	@PostMapping("/address")
	public Address CreateAddressDetails(@RequestBody Address address) {
		return addressService.CreateAddressdetails(address);
		
	}
	@GetMapping("/address")
	public List<Address> finalAllAddress(){
	return addressService.finalAllAddress();
	}
	
	@GetMapping("/address/{id}")
	public Optional<Address>findAddressDetailsById(@PathVariable Long id){
		return addressService.findAddressdetailsById(id);
		
	}
	@DeleteMapping("/address")
	public  String deleteAddressDetailsById(@RequestParam Long id) {
		return addressService.deleteAddressById(id);
	}

		@PutMapping("/address/{id}")
		public Address UpdateAddressdetails(@RequestBody Address address) {
			return addressService.updateAddressdetails(address);
			
		}
//	
}
