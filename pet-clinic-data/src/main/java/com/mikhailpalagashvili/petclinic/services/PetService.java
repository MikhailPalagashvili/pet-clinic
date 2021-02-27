package com.mikhailpalagashvili.petclinic.services;

import com.mikhailpalagashvili.petclinic.model.Owner;
import com.mikhailpalagashvili.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Owner owner);

    Set<Pet> findAll();
}
