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
import com.Technosignia.QuikEstate.entity.Owner;
import com.Technosignia.QuikEstate.service.OwnerService;
@RestController
public class OwnerController {
	@Autowired
    OwnerService ownerservice;
    
	@PostMapping("/owner")
	public Owner CreateOwnerDetails(@RequestBody Owner owner) {
		return ownerservice.Createownerdetails(owner);
		
	}
	@GetMapping("/owner")
	public List<Owner> finalAllOwner(){
	return ownerservice.finalAllowner();
	}
	
	@GetMapping("/owner/{id}")
	public Optional<Owner>findownerDetailsById(@PathVariable Long id){
		return ownerservice.findownerdetailsById(id);
		
	}
	@DeleteMapping("/owner")
	public  String deleteOwnerDetailsById(@RequestParam Long id) {
		return ownerservice.deleteOwnerById(id);
	}

		@PutMapping("/owner")
		public Owner UpdateOwnerdetails(@RequestBody Owner owner) {
			return ownerservice.updateOwnerdetails(owner);
			
		}


}

