package com.mikhailpalagashvili.petclinic.repository;

import com.mikhailpalagashvili.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
