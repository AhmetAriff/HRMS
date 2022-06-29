package com.example.hrms.Entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="job_positions")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class JobPositions implements Serializable {

    @Id
    @SequenceGenerator(name="seq_job_positions",allocationSize = 1)
    @GeneratedValue(generator = "seq_job_positions",strategy = GenerationType.SEQUENCE)
    public int jobId;

    @Column(name = "job_name",length = 50)
    public String jobName;


}
