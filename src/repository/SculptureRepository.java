package repository;

import entity.SculptureEntity;
import mapper.SculptureEntityMapper;
import service.DatabaseQueryExecutorService;

import java.util.ArrayList;
import java.util.List;

public class SculptureRepository {
    public static List<SculptureEntity> findall(){
        List<Object> objects = DatabaseQueryExecutorService.executeReadQuery("select * from sculpture", new SculptureEntityMapper());
        List<SculptureEntity> result = new ArrayList<>();
        for (Object object: objects){
            if(object instanceof SculptureEntity){
                result.add((SculptureEntity) object);
            }
            else {
                throw new RuntimeException("Expected SculptureEntity");
            }
        }
        return result;
    }

    //void method
    public static void insertSculpture(int start_price, String origin_country, int weight, String material){
        String sql = "insert into sculpture(start_price, origin_country, weight, material) values ("+
                start_price+",'"+origin_country+"',"+weight+",'"+material+"')";
        DatabaseQueryExecutorService.executeUpdateQuery(sql);
    }

    public static void deleteSculpture(int id){
        String sql = "delete from sculpture where id="+id;
        DatabaseQueryExecutorService.executeUpdateQuery(sql);
    }

    public static void createTableSculpture(){
        String sql = "create table sculpture(id int primary key auto_increment," +
                "start_price int, origin_country varchar(255), weight int, material varchar(255))";
        DatabaseQueryExecutorService.executeCreateQuery(sql);
    }
}
