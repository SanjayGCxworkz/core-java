package com.xworkz.dto;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "product")
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "findByName",query = "select et from ProductDetails as et where et.name=:n")
@NamedQuery(name = "getAllProducts",query = "select et from ProductDetails as et ")
@NamedQuery(name = "findById",query = "select et from ProductDetails as et where et.id=:number")
public class ProductDetails {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "company")
    private String company;
    @Column(name = "mDate")
    private String mDate;
    @Column(name = "exDate")
    private String exDate;
    @Column(name = "price")
    private double price;

    public ProductDetails(String name, String company, String mDate, String exDate, double price){
        this.company=company;
        this.exDate=exDate;
        this.name=name;
        this.mDate=mDate;
        this.price=price;
    }
}
