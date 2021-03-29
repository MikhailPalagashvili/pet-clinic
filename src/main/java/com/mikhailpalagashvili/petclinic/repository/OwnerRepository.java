package com.mikhailpalagashvili.petclinic.repository;

import com.mikhailpalagashvili.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
