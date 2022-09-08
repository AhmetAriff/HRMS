package com.example.hrms.Entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
@Entity
@Table(name="ForeignLanguage")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class ForeignLanguage implements Serializable {

    @Id
    @SequenceGenerator(name="seq_foreign_language",allocationSize = 1)
    @GeneratedValue(generator = "seq_foreign_language",strategy = GenerationType.SEQUENCE)
    private int foreignLanguageId;


    @Column(name="language_name")
    @NotNull
    @NotBlank
    private String languageName;

    @Column(name="language_level")
    @Size(min=1,max = 5)
    @NotNull
    @NotBlank
    private int languageLevel;

    @ManyToOne
    @JoinColumn(name="cv_id")
    private Cv cv;


}
