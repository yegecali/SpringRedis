package com.yegecali.examplerediscache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person save(Person person){
        return personRepository.save(person);
    }
    @Cacheable(value = "Person", key = "#id")
    public Person getById(String id){
        return personRepository.findById(id).get();
    }
    @CachePut(value = "Person", key = "#id")
    public Person update(Person person, String id){
        Person p = personRepository.findById(id).get();
        p.setName(person.getName());
        p.setLastName(person.getLastName());
        return personRepository.save(p);
    }
    @Cacheable(value = "listPerson")
    public List<Person> getAll(){
        return personRepository.findAll();
    }
    @CachePut(value = "Person", key = "#id")
    public void delete(String id){
        personRepository.deleteById(id);
    }

}
