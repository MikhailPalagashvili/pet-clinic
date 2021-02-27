package com.mikhailpalagashvili.petclinic.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Pet extends BaseEntity {
    private PetType petType;
    private Owner owner;
    private LocalDateTime birthDate;
}
