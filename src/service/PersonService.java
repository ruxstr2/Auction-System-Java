package service;

import entity.PersonEntity;
import model.Person;
import repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    public static List<Person> getAllPersons(){
        List<PersonEntity> personEntities = PersonRepository.findall();
        List <Person> result = new ArrayList<>();
        for (PersonEntity personEntity : personEntities){
            result.add(new Person(personEntity.getLast_name(),personEntity.getFirst_name(),
                    personEntity.getPhone_number(), personEntity.getE_mail()));
        }
        return result;
    }

    //void method
    public static void insertPerson(String last_name, String first_name, String phone_number, String e_mail){
        PersonRepository.insertPerson(last_name,first_name,phone_number,e_mail);
    }

    public static void deletePerson(String last_name){
        PersonRepository.deletePerson(last_name);
    }

    public static void createTablePerson(){
        PersonRepository.createTablePerson();
    }

    public static void updatePerson(String last_name, String e_mail){
        PersonRepository.updateTablePerson(last_name, e_mail);
    }
}
