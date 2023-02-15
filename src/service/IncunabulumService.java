package service;

import entity.IncunabulumEntity;
import model.Incunabulum;
import repository.IncunabulumRepository;

import java.util.ArrayList;
import java.util.List;

public class IncunabulumService {
    public static List<Incunabulum> getAllIncunabula(){
        List<IncunabulumEntity> incunabulumEntities = IncunabulumRepository.findall();
        List <Incunabulum> result = new ArrayList<>();
        for (IncunabulumEntity incunabulumEntity : incunabulumEntities){
            result.add(new Incunabulum(incunabulumEntity.getId(), incunabulumEntity.getStart_price(),
                    incunabulumEntity.getOrigin_country(),incunabulumEntity.getYear(),
                    incunabulumEntity.getNo_pages()));
        }
        return result;
    }

    //void method
    public static void insertIncunabulum(int start_price, String origin_country, int year, int no_pages){
        IncunabulumRepository.insertIncunabulum(start_price,origin_country,year, no_pages);
    }

    public static void deleteIncunabulum(int id){
        IncunabulumRepository.deleteIncunabulum(id);
    }

    public static void createTableIncunabulum(){
        IncunabulumRepository.createTableIncunabulum();
    }

    public static void updateIncunabulum(int id, int new_start_price){
        IncunabulumRepository.updateTableIncunabulum(id,new_start_price);
    }
}
