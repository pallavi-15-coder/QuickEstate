package com.Technosignia.QuikEstate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Technosignia.QuikEstate.entity.Property;
import com.Technosignia.QuikEstate.repository.PropertyRepository;
@Service
public class PropertyService {
	@Autowired
	PropertyRepository propertyrepository;

	public Property createpropertydetails(Property property) {
		
		return propertyrepository.save(property);
		
	}

	public List<Property> finalAllproperty() {
		
		return propertyrepository.findAll();
	}

	public Optional<Property> findproperrtydetailsById(Long id) {
		
		return propertyrepository.findById(id);
	}

	public String deletepropertydetailsById(Long id) {
		propertyrepository.findById(id);
		return "Property deleted Successfully!";
	}

	public Property updatepropertydetails(Property property) {
		
		return propertyrepository.save(property);
	}

}
