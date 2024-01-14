package com.xworkz.wildlife.service;

import com.xworkz.wildlife.dto.AnimalDetails;
import com.xworkz.wildlife.repository.AnimalsRepository;
import com.xworkz.wildlife.repository.WildlifeRepository;

import java.util.List;

public class AnimalService implements WildlifeService{
    WildlifeRepository wildlifeRepository=new AnimalsRepository();
    @Override
    public void validateAndInsert(String name, int age, int weight) {
        if (name!=null && !name.isEmpty() && age!=0 && weight!=0){
            wildlifeRepository.insertData(name,age,weight);
        }else {
            System.out.println("Please provide the valid input!");
        }
    }

    @Override
    public void getAllAnimalsDetails() {
        List<AnimalDetails> list1=wildlifeRepository.getAllDetails();
        list1.forEach(AnimalDetails-> System.out.println("animal id: "+AnimalDetails.getId()+"  animal name: "+
                AnimalDetails.getName()+"  animal age: "+AnimalDetails.getAge()+"  animal weight: "+
                AnimalDetails.getWeight()+"\n"));
    }

    @Override
    public void getAnimalDetailsByName(String name) {
        if (name!=null && !name.isEmpty()) {
            AnimalDetails animal = wildlifeRepository.getDetailsByName(name);
            System.out.println("animal id: "+animal.getId()+"\n"+
                    "animal name: "+animal.getName()+"\n"+" animal age: "+animal.getAge()+"\n"
            +"animal weight: "+animal.getWeight());
        }else {
            System.out.println("please provide proper name.");
        }
    }

    @Override
    public void validateAndDelete(String name) {
        if (name!=null && !name.isEmpty()){
            wildlifeRepository.deleteByName(name);
        }else {
            System.out.println("invalid name.!");
        }
    }

    @Override
    public void validateAndUpdate(String name, int age) {
        if (name!=null && !name.isEmpty() && age!=0){
            wildlifeRepository.updateAgeByName(name,age);
        }else {
            System.out.println("invalid name.!");
        }
    }
}
