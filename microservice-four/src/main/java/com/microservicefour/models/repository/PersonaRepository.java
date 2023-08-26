package com.microservicefour.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservicefour.models.entity.Person;

@Repository
public interface PersonaRepository extends JpaRepository<Person, Long>{

}
