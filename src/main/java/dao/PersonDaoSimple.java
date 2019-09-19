package dao;

import domain.Person;

public class PersonDaoSimple implements PersonDao {

    public Person findByName(){
        String name = "Tony";
        String surname = "Brawn";
        return new Person(name, surname);
    }
}
