package service;

import entity.SculptureEntity;
import model.Sculpture;
import repository.SculptureRepository;

import java.util.ArrayList;
import java.util.List;

public class SculptureService {
    public static List<Sculpture> getAllSculptures(){
        List<SculptureEntity> sculptureEntities = SculptureRepository.findall();
        List <Sculpture> result = new ArrayList<>();
        for (SculptureEntity sculptureEntity : sculptureEntities){
            result.add(new Sculpture(sculptureEntity.getId(), sculptureEntity.getStart_price(), sculptureEntity.getOrigin_country(),
                    sculptureEntity.getWeight(),sculptureEntity.getMaterial()));
        }
        return result;
    }

    //void method
    public static void insertSculpture(int start_price, String origin_country, int weight, String material){
        SculptureRepository.insertSculpture(start_price,origin_country,weight,material);
    }

    public static void deleteSculpture(int id){
        SculptureRepository.deleteSculpture(id);
    }

    public static void createTableSculpture(){
        SculptureRepository.createTableSculpture();
    }
}
