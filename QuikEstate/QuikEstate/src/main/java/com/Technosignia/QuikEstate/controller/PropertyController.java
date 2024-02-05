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

import com.Technosignia.QuikEstate.entity.Property;
import com.Technosignia.QuikEstate.service.PropertyService;

@RestController
public class PropertyController {
    @Autowired
    PropertyService propertyservice;
    
    @PostMapping("/property")
    public Property CreatePropertyDetails(@RequestBody Property property) {
    return propertyservice.createpropertydetails(property);
    }
    @GetMapping("/property")
    public List<Property>finalAllProperty(){
    	return propertyservice.finalAllproperty();
    	 }
    
    @GetMapping("/property/{id}")
    public Optional<Property>findpropertyDetailsById(@PathVariable Long id){
    	return propertyservice.findproperrtydetailsById(id);
    	 }
    
    @DeleteMapping("/property")
    public String deletepropertydetailsById(@RequestParam Long id) {
    	return propertyservice.deletepropertydetailsById(id);
    	}
    @PutMapping("/property")
    public Property UpdatePropertydetails(@RequestBody Property property) {
    	return propertyservice.updatepropertydetails(property);
    }
}
