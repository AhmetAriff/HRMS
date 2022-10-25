package com.example.hrms.Entities;


import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

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
    private int id;

    @ManyToOne
    @JoinColumn(name = "job_position_id")
    private JobPositions jobPositions;

    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employers employers;

    @Column(name = "description",length = 100)
    private String description;


    @Column(name = "min_salary",length = 10)
    private String minSalary;


    @Column(name = "max_salary",length = 10)
    private String maxSalary;

    @Column(name = "open_positions",length = 10)
    private int openPositions;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Column(name = "deadline")
    private Date deadline;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Column(name = "release_date")
    private Date releaseDate ;
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @Column(name = "status")
    private boolean status;







}
