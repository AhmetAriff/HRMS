package com.example.hrms.Entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="JobExperience")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class JobExperience implements Serializable {
    @Id
    @SequenceGenerator(name="seq_job_experience",allocationSize = 1)
    @GeneratedValue(generator = "seq_job_experience",strategy = GenerationType.SEQUENCE)
    private int jobExperience;

    @Column(name = "experience_naem",length = 100)
    private String experienceName;

    @Column(name = "start_of_experience",length = 100)
    private int start_of_experience;

    @Column(name = "end_of_experience",length = 100)
    private int end_of_experience;

    @ManyToOne
    @JoinColumn(name = "cv_id")
    private Cv cv;

}
