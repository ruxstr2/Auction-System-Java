package service;

import entity.PaintingEntity;
import model.Painting;
import repository.PaintingRepository;

import java.util.ArrayList;
import java.util.List;

public class PaintingService {
    public static List<Painting> getAllPaintings(){
        List<PaintingEntity> paintingEntities = PaintingRepository.findall();
        List <Painting> result = new ArrayList<>();
        for (PaintingEntity paintingEntity : paintingEntities){
            result.add(new Painting(paintingEntity.getId(), paintingEntity.getStart_price(), paintingEntity.getOrigin_country(),
                    paintingEntity.getWidth(),paintingEntity.getHeight()));
        }
        return result;
    }

    //void method
    public static void insertPainting(int start_price, String origin_country, int width, int height){
        PaintingRepository.insertPainting(start_price,origin_country,width,height);
    }

    public static void deletePainting(int id){
        PaintingRepository.deletePainting(id);
    }
}
