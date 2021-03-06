package com.example.hrms.Entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="SystemPersonal")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class SystemPersonal implements Serializable {

    @Id
    @SequenceGenerator(name="seq_personals",allocationSize = 1)
    @GeneratedValue(generator = "seq_personals",strategy = GenerationType.SEQUENCE)
    private int personalId;


    @Column(length = 50,name = "personal_first_name")
    private String personalFirstName;


    @Column(length = 50,name = "personal_last_name")
    private String personalLastName;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;


}
