package com.xworkz.wildlife.service;

public interface WildlifeService {

     void validateAndInsert(String name,int age,int weight);

     void getAllAnimalsDetails();

     void getAnimalDetailsByName(String name);

     void validateAndDelete(String name);

     void validateAndUpdate(String name,int age);
}
