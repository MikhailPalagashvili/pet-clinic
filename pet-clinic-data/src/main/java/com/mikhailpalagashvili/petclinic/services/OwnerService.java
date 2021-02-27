package com.mikhailpalagashvili.petclinic.services;

import com.mikhailpalagashvili.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

    Owner findByLastName(String lastName);
}
