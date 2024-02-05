package com.Technosignia.QuikEstate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Technosignia.QuikEstate.entity.Property;

public interface PropertyRepository extends JpaRepository <Property,Long>{

}
