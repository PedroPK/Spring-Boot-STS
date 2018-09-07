package com.example.algaworks.model.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Guest implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private Integer qtCompanions;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQtCompanions() {
		return qtCompanions;
	}

	public void setQtCompanions(Integer qtCompanions) {
		this.qtCompanions = qtCompanions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((qtCompanions == null) ? 0 : qtCompanions.hashCode());
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
		Guest other = (Guest) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (qtCompanions == null) {
			if (other.qtCompanions != null)
				return false;
		} else if (!qtCompanions.equals(other.qtCompanions))
			return false;
		return true;
	}
	
}