package com.example.algaworks.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algaworks.model.entity.Guest;

public interface GuestJpaRepository extends JpaRepository<Guest, Long>{

}