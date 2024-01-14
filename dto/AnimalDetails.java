package com.xworkz.wildlife.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class AnimalDetails {
    private int id;
    private String name;
    private int age;
    private int weight;

   public AnimalDetails(){

    }
}
