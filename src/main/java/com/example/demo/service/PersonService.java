package com.example.demo.service;

import com.example.demo.dao.IPersonDao;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final IPersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("fakeDao") IPersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }

    public List<Person> getAllPeople(){return personDao.getAllPeople();}
}
