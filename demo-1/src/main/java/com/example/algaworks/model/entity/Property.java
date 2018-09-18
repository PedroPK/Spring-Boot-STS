package com.example.algaworks.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Property {
	
	@Id
	private String name;
	
	private String value;
	private String description;
	private String category;
	private String subcategory;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubCategory() {
		return subcategory;
	}
	public void setSubCategory(String subCategory) {
		this.subcategory = subCategory;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category		== null) ? 0 : category		.hashCode());
		result = prime * result + ((description		== null) ? 0 : description	.hashCode());
		result = prime * result + ((name			== null) ? 0 : name			.hashCode());
		result = prime * result + ((subcategory		== null) ? 0 : subcategory	.hashCode());
		result = prime * result + ((value			== null) ? 0 : value		.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Property other = (Property) obj;
		
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		
		if (subcategory == null) {
			if (other.subcategory != null)
				return false;
		} else if (!subcategory.equals(other.subcategory))
			return false;
		
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		
		return true;
	}
	
}