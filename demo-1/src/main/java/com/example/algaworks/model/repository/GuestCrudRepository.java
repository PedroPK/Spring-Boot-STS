package com.example.algaworks.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.algaworks.model.entity.Guest;

public interface GuestCrudRepository extends CrudRepository<Guest, Long>{

}
