package com.example.hrms.Entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
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
    private int employerId;


    @Column(length = 50,name = "company_name")
    private String companyName;


    @Column(length = 50,name = "website")
    private String website;


    @Column(length = 50,name = "tel_num")
    private String telNum;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;

    @OneToMany(mappedBy = "employers")
    private List<JobAdvertisement> jobAdvertisements;




}
