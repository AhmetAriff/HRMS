package com.example.hrms.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="CV")
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor

public class Cv implements Serializable {
    @Id
    @SequenceGenerator(name="seq_cv",allocationSize = 1)
    @GeneratedValue(generator = "seq_cv",strategy = GenerationType.SEQUENCE)
    private int cvId;


    @OneToOne
    @JoinColumn(name = "social_Media_Id")
    private SocialMedia socialMedia;

    @ManyToMany
    @JoinTable(name = "schools_cv",joinColumns = @JoinColumn(name = "cvId"), inverseJoinColumns = @JoinColumn(name = "schoolsId"))
    private Set<Schools> addedSchools  ;

    @OneToMany(mappedBy = "cv")
    private Set<JobExperience>  jobExperience;

    @ManyToMany(mappedBy = "cv")
    @JoinTable(name = "foriegn_language_cv",joinColumns = @JoinColumn(name = "cvId"), inverseJoinColumns = @JoinColumn(name = "foreignLanguageId"))
    private Set<ForeignLanguage>  foreignLanguage ;

    @OneToOne
    @JoinColumn(name="image_url")
    private Image image;

    @ManyToMany(mappedBy = "cv")
    @JoinTable(name = "programmingLanguages_cv",joinColumns = @JoinColumn(name = "cvId"), inverseJoinColumns = @JoinColumn(name = "programmingLanguageId"))
    private Set<ProgrammingLanguage>  programmingLanguage ;

    @Column(name="cover_letter",length = 300)
    private String CoverLetter;


}
