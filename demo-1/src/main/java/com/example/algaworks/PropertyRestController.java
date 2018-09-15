package com.example.algaworks;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.algaworks.model.entity.Property;
import com.example.algaworks.model.repository.PropertyRepository;

@RestController
@RequestMapping("/prc")
public class PropertyRestController {
	
	@Autowired
	private PropertyRepository propertyRepository;
	
	@RequestMapping(value="/find/{filter}", method=RequestMethod.GET)
	List<Property> selectByFilter(
		@PathVariable("filter")		String pFilter
	) {
		return this.propertyRepository.selectByFilter(pFilter);
	}
	
}