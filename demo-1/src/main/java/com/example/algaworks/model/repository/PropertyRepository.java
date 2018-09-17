package com.example.algaworks.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.example.algaworks.model.entity.Property;

public interface PropertyRepository extends PagingAndSortingRepository<Property, String> {
	
	@Query( "Select 		p " +
			"From Property	p " +
			"Where 			p.name like %:filter% " +
			"Order by Category, SubCategory, Name")
	public List<Property> selectByFilter(@Param("filter") String pFilter);
	
}