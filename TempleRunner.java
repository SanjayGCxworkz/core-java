package com.xworkz;

import com.xworkz.dto.TempleEntity;
import com.xworkz.repository.TempleRepository;
import com.xworkz.repository.TempleRepositoryImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TempleRunner {


    public static void main(String[] args) {

        TempleEntity templeEntity=new TempleEntity("Hanuman","Karnataka",300,4000, LocalDate.of(1920,2,23),"hanuman",1220);
        TempleRepository templeRepository=new TempleRepositoryImpl();
      //  templeRepository.save(templeEntity);


        TempleEntity templeEntity1=new TempleEntity("dharmastala","karnataka",200,
                2000, LocalDate.of(1930,2,23),"shiva",3000);

        TempleEntity templeEntity2=new TempleEntity("ayodhya","uttar pradesh",500,
                5000, LocalDate.of(1930,2,23),"ram",4000);

        TempleEntity templeEntity3=new TempleEntity("hassanambha","karnataka",300,
                3000, LocalDate.of(1930,2,23),"hassanamba",1000.2);

        TempleEntity templeEntity4=new TempleEntity("tirupathi","andra",300,
                3000, LocalDate.of(1930,2,23),"govindha",6000.45);

      //  List<TempleEntity> list= Arrays.asList(templeEntity1,templeEntity2,templeEntity3,templeEntity4);
       // templeRepository.saveAll(list);

       // List<TempleEntity> entities=templeRepository.findAllByLocation("karnataka");
       // entities.forEach(en-> System.out.println(en));

        //List<TempleEntity> entities3=templeRepository.findAllByEntryFeeGreaterThen(200);
        //entities.forEach(System.out::println);

        //List<TempleEntity> entities1=templeRepository.findAllByEntryFeeBetween(300,500);
        //entities1.forEach(System.out::println);

      //  List<TempleEntity> entities=templeRepository.findAllByOpenedDateGreaterThen(LocalDate.of(1925,2,23));
      // entities.forEach(System.out::println);

        //List<TempleEntity> entities2=templeRepository.findAllByGodAndLocation("karnataka","hanuman");
        //entities2.forEach(System.out::println);

        //TempleEntity entity=templeRepository.findById(3);
        //System.out.println(entity);

        //System.out.println(templeRepository.findByIdAndGod(3,"ram"));

        //System.out.println(templeRepository.findTempleByMaxEntryFee());

       // System.out.println(templeRepository.findTotal());

        //templeRepository.updateEntityLocationByName("tirumala","thirupati");

        templeRepository.updateEntryFeeByName(650,"ayodhya");
        templeRepository.updateLocationAndDimensionById("tirumala",7000.2,4);


    }

}
