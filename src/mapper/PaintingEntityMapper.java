package mapper;

import entity.PaintingEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PaintingEntityMapper implements RowMapper<PaintingEntity>{
    public PaintingEntity mapRow(ResultSet resultSet) throws SQLException {
        int id  = resultSet.getInt("id");
        int start_price  = resultSet.getInt("start_price");
        String origin_country = resultSet.getString("origin_country");
        int width  = resultSet.getInt("width");
        int height  = resultSet.getInt("height");

        return new PaintingEntity(id, start_price, origin_country,width,height);
    }
}
