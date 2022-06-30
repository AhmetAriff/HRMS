package com.example.hrms.Entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="employers")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Employers implements Serializable {

    @Id
    @SequenceGenerator(name="seq_employers",allocationSize = 1)
    @GeneratedValue(generator = "seq_employers",strategy = GenerationType.SEQUENCE)
    public int employerId;


    @Column(length = 50,name = "company_name")
    public String companyName;


    @Column(length = 50,name = "website")
    public String website;


    @Column(length = 50,name = "tel_num")
    public String telNum;

    @OneToOne
    @JoinColumn(name="user_id")
    public User user;

    @OneToMany(mappedBy = "employers")
    public List<JobAdvertisement> jobAdvertisements;




}
