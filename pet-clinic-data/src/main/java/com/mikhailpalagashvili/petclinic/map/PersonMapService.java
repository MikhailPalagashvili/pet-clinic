package com.mikhailpalagashvili.petclinic.map;

import com.mikhailpalagashvili.petclinic.model.Person;
import com.mikhailpalagashvili.petclinic.services.CrudService;

import java.util.Set;

public class PersonMapService extends AbstractMapService<Person, Long> implements CrudService<Person, Long> {
    @Override
    public Person findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Person save(Person person) {
        return super.save(person.getId(), person);
    }

    @Override
    public Set<Person> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Person person) {
        super.delete(person);
    }
}
