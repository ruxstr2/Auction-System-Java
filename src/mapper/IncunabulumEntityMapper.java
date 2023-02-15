package mapper;

import entity.IncunabulumEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class IncunabulumEntityMapper implements RowMapper<IncunabulumEntity>{
    public IncunabulumEntity mapRow(ResultSet resultSet) throws SQLException {
        int id  = resultSet.getInt("id");
        int start_price  = resultSet.getInt("start_price");
        String origin_country = resultSet.getString("origin_country");
        int year  = resultSet.getInt("year_publication");
        int no_pages = resultSet.getInt("no_pages");

        return new IncunabulumEntity(id, start_price, origin_country,year, no_pages);
    }
}
