package com.example.hrms.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="users")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class User implements Serializable {


    @Id
    @SequenceGenerator(name="seq_user",allocationSize = 1)
    @GeneratedValue(generator = "seq_user",strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(length = 50,name = "mail")
    private String mail;

    @Column(length = 50,name="password")
    private String password;

    @Column(name = "is_email_enabled")
    private boolean emailEnabled;

    @Column(name = "verification",updatable = false,nullable = false)
    private int verificationCode;



}
