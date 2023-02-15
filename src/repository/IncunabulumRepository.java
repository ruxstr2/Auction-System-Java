package repository;

import entity.IncunabulumEntity;
import mapper.IncunabulumEntityMapper;
import service.DatabaseQueryExecutorService;

import java.util.ArrayList;
import java.util.List;

public class IncunabulumRepository {
    public static List<IncunabulumEntity> findall(){
        List<Object> objects = DatabaseQueryExecutorService.executeReadQuery("select * from incunabulum", new IncunabulumEntityMapper());
        List<IncunabulumEntity> result = new ArrayList<>();
        for (Object object: objects){
            if(object instanceof IncunabulumEntity){
                result.add((IncunabulumEntity) object);
            }
            else {
                throw new RuntimeException("Expected IncunabulumEntity");
            }
        }
        return result;
    }

    //void method
    public static void insertIncunabulum(int start_price, String origin_country, int year, int no_pages){
        String sql = "insert into incunabulum(start_price, origin_country, year_publication, no_pages) values ("+
                start_price+",'"+origin_country+"',"+year+","+no_pages+")";
        DatabaseQueryExecutorService.executeUpdateQuery(sql);
    }

    public static void deleteIncunabulum(int id){
        String sql = "delete from incunabulum where id="+id;
        DatabaseQueryExecutorService.executeUpdateQuery(sql);
    }

    public static void createTableIncunabulum(){
        String sql = "create table incunabulum(id int primary key auto_increment," +
                "start_price int, origin_country varchar(255),year_publication int,no_pages int)";
        DatabaseQueryExecutorService.executeCreateQuery(sql);
    }

    public static void updateTableIncunabulum(int id, int new_price){
        String sql = "update incunabulum set start_price="+new_price+" where id="+id;
        DatabaseQueryExecutorService.executeUpdateQuery(sql);
    }
}
