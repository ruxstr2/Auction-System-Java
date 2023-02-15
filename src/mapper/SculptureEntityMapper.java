package mapper;

import entity.SculptureEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SculptureEntityMapper implements RowMapper<SculptureEntity>{
    public SculptureEntity mapRow(ResultSet resultSet) throws SQLException {
        int id  = resultSet.getInt("id");
        int start_price  = resultSet.getInt("start_price");
        String origin_country = resultSet.getString("origin_country");
        int weight  = resultSet.getInt("weight");
        String material  = resultSet.getString("material");

        return new SculptureEntity(id, start_price, origin_country,weight,material);
    }
}
