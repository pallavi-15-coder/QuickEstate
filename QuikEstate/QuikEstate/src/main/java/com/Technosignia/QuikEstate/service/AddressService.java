package com.Technosignia.QuikEstate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.QuikEstate.entity.Address;
import com.Technosignia.QuikEstate.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	AddressRepository addressRepository;

	public Address CreateAddressdetails(Address address) {
		return addressRepository.save(address);
	}

	public List<Address> finalAllAddress() {
		return addressRepository.findAll();
	}

	public Optional<Address> findAddressdetailsById(Long id) {
				return addressRepository.findById(id);
	}

	public String deleteAddressById(Long id) {
		
		addressRepository.findById(id);
		return "Deletion Successfully";
	}

	public Address updateAddressdetails(Address address) {
		return addressRepository.save(address);
	}
}
