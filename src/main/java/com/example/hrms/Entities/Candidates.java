package com.example.hrms.Entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="candidates")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Candidates implements Serializable {

    @Id
    @SequenceGenerator(name="seq_candidates",allocationSize = 1)
    @GeneratedValue(generator = "seq_candidates",strategy = GenerationType.SEQUENCE)
    private int candidatesId;

    @Column(length = 50,name = "first_name")
    private String firstName;

    @Column(length = 50,name = "last_name")
    private String lastName;

    @Column(length = 11,name = "identity_number")
    private String identityNumber;

    @Column(length = 20,name = "birth_date")
    private String birthDate;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;

    @OneToOne
    @JoinColumn(name="cv_id")
    private Cv cv;












}
