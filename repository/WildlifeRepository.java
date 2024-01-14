package com.xworkz.wildlife.repository;

import com.xworkz.wildlife.dto.AnimalDetails;

import java.util.List;

public interface WildlifeRepository {

     void insertData(String name,int age,int weight);

     void updateAgeByName(String name,int age);

     void deleteByName(String name);

     List<AnimalDetails> getAllDetails();

     AnimalDetails getDetailsByName(String name);
}
