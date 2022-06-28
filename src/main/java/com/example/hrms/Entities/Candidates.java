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
    public int candidatesId;

    @Column(length = 50,name = "first_name")
    public String firstName;

    @Column(length = 50,name = "last_name")
    public String lastName;

    @Column(length = 11,name = "identity_number")
    public String identityNumber;

    @Column(length = 20,name = "birth_date")
    public String birthDate;

    @OneToOne
    @JoinColumn(name="user_id")
    public User user;












}
