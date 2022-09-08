package com.example.hrms.Entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="SocialMedia")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class SocialMedia implements Serializable {

    @Id
    @SequenceGenerator(name="seq_social_media",allocationSize = 1)
    @GeneratedValue(generator = "seq_social_media",strategy = GenerationType.SEQUENCE)
    private int socialMediaId;

    @Column(name = "github_url",length = 50)
    private String githubUrl;

    @Column(name = "linkedn_url",length = 50)
    private String linkednUrl;










}
