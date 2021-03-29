package com.mikhailpalagashvili.petclinic.repository;

import com.mikhailpalagashvili.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
