package com.example.hrms.Entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="cities")
@Getter
@Setter
@ToString
@RequiredArgsConstructor

public class City implements Serializable {

    @Id
    @SequenceGenerator(name="seq_cities",allocationSize = 1)
    @GeneratedValue(generator = "seq_cities",strategy = GenerationType.SEQUENCE)
    private int cityId;


    @Column(name = "city_name",length = 30,unique = true)
    private String cityName;

    @OneToMany(mappedBy = "city")
    private List<JobAdvertisement> jobAdvertisements;



}
