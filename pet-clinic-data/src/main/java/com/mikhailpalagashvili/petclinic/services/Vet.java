package com.mikhailpalagashvili.petclinic.services;

import com.mikhailpalagashvili.petclinic.model.Owner;

import java.util.Set;

public interface Vet {
    Vet findById(Long id);

    Vet save(Owner owner);

    Set<Vet> findAll();
}
