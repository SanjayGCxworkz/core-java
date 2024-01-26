package com.xworkz.repository;

import com.xworkz.dto.TempleEntity;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public interface TempleRepository {


    default void save(TempleEntity templeEntity){}

    default void saveAll(List<TempleEntity> templeEntityList){}

    default List<TempleEntity> findAllByLocation(String location){
        return Collections.emptyList();
    }

    default List<TempleEntity> findAllByEntryFeeGreaterThen(int fee){
        return Collections.emptyList();
    }

    default List<TempleEntity> findAllByEntryFeeBetween(int first , int second){return Collections.emptyList();}

    default List<TempleEntity> findAllByOpenedDateGreaterThen(LocalDate date){return Collections.emptyList();}

    default List<TempleEntity> findAllByGodAndLocation(String location,String god){return Collections.emptyList();}

    default TempleEntity findById(int id){return null;}

    default TempleEntity findByIdAndGod(int id,String god){return null;}

    default TempleEntity findTempleByMaxEntryFee(){return null;}

    default long findTotal(){return 0;}

    default void updateEntityLocationByName(String location ,String name){}

    default void updateEntryFeeByName(int entryFee,String name){}

    default void updateLocationAndDimensionById(String location,double dimension,int id){}
}
