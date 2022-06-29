package com.example.hrms.Entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="job_advertisement")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class JobAdvertisement implements Serializable {

    @Id
    @SequenceGenerator(name="seq_job_advertisement",allocationSize = 1)
    @GeneratedValue(generator = "seq_job_advertisement",strategy = GenerationType.SEQUENCE)
    public int id;

    @Column(name = "description",length = 100)
    public String description;


    @Column(name = "min_salary",length = 10)
    public String minSalary;


    @Column(name = "max_salary",length = 10)
    public String maxSalary;

    @Column(name = "open_positions",length = 10)
    public int openPositions;

    @Column(name = "deadline",length = 20)
    public String deadline;






}
