package service;

import dao.PersonDao;
import domain.Person;

public class PersonServiceImpl implements PersonService {
    private final PersonDao dao;

    public PersonServiceImpl(PersonDao dao) {
        this.dao = dao;
    }

    public Person getByName() {
        return dao.findByName();
    }
}
