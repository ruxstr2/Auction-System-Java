package mapper;

import entity.PersonEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonEntityMapper implements RowMapper<PersonEntity>{
    public PersonEntity mapRow(ResultSet resultSet) throws SQLException {
        String last_name = resultSet.getString("last_name");
        String first_name = resultSet.getString("first_name");
        String phone_number = resultSet.getString("phone_number");
        String e_mail = resultSet.getString("e_mail");

        return new PersonEntity(last_name, first_name, phone_number, e_mail);
    }
}
