package com.xworkz.dto;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "temple")
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@NamedQuery(name="findAllByLocation",query = "select entity from TempleEntity entity where entity.location=:l")
@NamedQuery(name = "findAllByEntryFeeGreaterThen",query = "select entity from TempleEntity entity where entity.entryFee>:fee")
@NamedQuery(name="findAllByEntryFeeBetween",query = "select entity from TempleEntity entity where entryFee between :first and :second")
@NamedQuery(name = "findAllByOpenedDateGreaterThen",query = "select entity from TempleEntity entity where date>:d")
@NamedQuery(name="findAllByGodAndLocation",query = "select entity from TempleEntity entity where entity.location=:loc and entity.god=:go")
@NamedQuery(name = "findByIdAndGod",query = "select entity from TempleEntity entity where entity.id=:num and entity.god=:go")
@NamedQuery(name = "findAll",query = "select entity from TempleEntity entity")
@NamedQuery(name="updateLocationByName",query = "update TempleEntity as entity set entity.location=:loc where entity.name=:n")
@NamedQuery(name = "updateEntryFeeByName",query = "update TempleEntity as entity set entity.entryFee=:num where entity.name=:n")
@NamedQuery(name = "updateLocationAndDimensionById",query = "update TempleEntity as entity set entity.location=:loc,entity.dimension=:dim where entity.id=:num")
public class TempleEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    @NonNull
    private String name;
    @NonNull
    @Column(name = "location")
    private String location;
    @Column(name = "entryFee")
    @NonNull
    private int entryFee;
    @Column(name = "vipFee")
    @NonNull
    private int vipFee;
    @Column(name = "date")
    @NonNull
    private LocalDate date;
    @Column(name = "god")
    @NonNull
    private String god;
    @Column(name="dimension")
    @NonNull
    private double dimension;
}
