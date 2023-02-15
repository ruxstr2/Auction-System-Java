package repository;

import entity.PersonEntity;
import mapper.PersonEntityMapper;
import service.DatabaseQueryExecutorService;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {
    public static List<PersonEntity> findall(){
        List<Object> objects = DatabaseQueryExecutorService.executeReadQuery("select * from person", new PersonEntityMapper());
        List<PersonEntity> result = new ArrayList<>();
        for (Object object: objects){
            if(object instanceof PersonEntity){
                result.add((PersonEntity) object);
            }
            else {
                throw new RuntimeException("Expected PersonEntity");
            }
        }
        return result;
    }

    //void method
    public static void insertPerson(String last_name, String first_name, String phone_number, String e_mail){
        String sql = "insert into person(last_name, first_name, phone_number, e_mail) values ('"+
                last_name+"','"+first_name+"','"+phone_number+"','"+e_mail+"')";
        DatabaseQueryExecutorService.executeUpdateQuery(sql);
    }

    public static void deletePerson(String last_name){
        String sql = "delete from person where last_name='"+last_name+"'";
        DatabaseQueryExecutorService.executeUpdateQuery(sql);
    }

    public static void createTablePerson(){
        String sql = "create table person(id int primary key auto_increment," +
                "last_name varchar(255),first_name varchar(255), phone_number varchar(255)," +
                "e_mail varchar(255))";
        DatabaseQueryExecutorService.executeCreateQuery(sql);
    }

    public static void updateTablePerson(String last_name, String new_email){
        String sql = "update person set e_mail='"+new_email+"' where last_name='"+last_name+"'";
        DatabaseQueryExecutorService.executeUpdateQuery(sql);
    }
}
