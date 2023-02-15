package repository;
import entity.PaintingEntity;
import mapper.PaintingEntityMapper;
import service.DatabaseQueryExecutorService;

import java.util.ArrayList;
import java.util.List;

public class PaintingRepository {
    public static List<PaintingEntity> findall(){
        List<Object> objects = DatabaseQueryExecutorService.executeReadQuery("select * from painting", new PaintingEntityMapper());
        List<PaintingEntity> result = new ArrayList<>();
        for (Object object: objects){
            if(object instanceof PaintingEntity){
                result.add((PaintingEntity) object);
            }
            else {
                throw new RuntimeException("Expected PaintingEntity");
            }
        }
        return result;
    }

    //void method
    public static void insertPainting(int start_price, String origin_country, int width, int height){
        String sql = "insert into painting(start_price, origin_country, width, height) values ("+
                start_price+",'"+origin_country+"',"+width+","+height+")";
        DatabaseQueryExecutorService.executeUpdateQuery(sql);
    }

    public static void deletePainting(int id){
        String sql = "delete from painting where id="+id;
        DatabaseQueryExecutorService.executeUpdateQuery(sql);
    }
}
