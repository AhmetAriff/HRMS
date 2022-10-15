package com.example.hrms.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Entity
@Table(name="CV")
@Getter
@Setter
@ToString
@RequiredArgsConstructor

public class Cv implements Serializable {
    @Id
    @SequenceGenerator(name="seq_cv",allocationSize = 1)
    @GeneratedValue(generator = "seq_cv",strategy = GenerationType.SEQUENCE)
    private int cvId;


    @OneToOne
    @JoinColumn(name = "social_Media_Id")
    private SocialMedia socialMedia;

    @OneToMany(mappedBy = "cv")
    private List<Schools> schools;

    @OneToMany(mappedBy = "cv")
    private List<JobExperience>  jobExperience;

    @OneToMany(mappedBy = "cv")
    private List<ForeignLanguage>  foreignLanguage;

    @OneToOne
    @JoinColumn(name="image_url")
    private Image image;

    @OneToMany(mappedBy = "cv")
    private List<ProgrammingLanguage>  programmingLanguage;

    @Column(name="cover_letter",length = 300)
    private String CoverLetter;

}
