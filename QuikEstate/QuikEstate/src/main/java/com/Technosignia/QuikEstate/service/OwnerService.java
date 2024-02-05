package com.Technosignia.QuikEstate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.QuikEstate.entity.Owner;
import com.Technosignia.QuikEstate.repository.OwnerRepository;
@Service
public class OwnerService {
	@Autowired
	
	OwnerRepository ownerrepository;

	public Owner Createownerdetails(Owner owner) {
		return ownerrepository.save(owner);
	}

	public List<Owner> finalAllowner() {
		
		return ownerrepository.findAll();
	}

	public Optional<Owner> findownerdetailsById(Long id) {
		
		return ownerrepository.findById(id);
	}

	public String deleteOwnerById(Long id) {
		
		 ownerrepository.deleteById(id);
		 return "Owner deleted sucessfully!";
	}

	public Owner updateOwnerdetails(Owner owner) {
		
		return ownerrepository.save(owner);
	}

}
