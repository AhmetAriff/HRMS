package com.example.hrms.Entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="ProgrammingLanguage")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class ProgrammingLanguage implements Serializable {

    @Id
    @SequenceGenerator(name="seq_programming_language",allocationSize = 1)
    @GeneratedValue(generator = "seq_programming_language",strategy = GenerationType.SEQUENCE)
    private int programmingLanguageId;

    @Column(name = "programmşng_language_name",length = 100)
    private String programmingLanguageName;

    @ManyToOne
    @JoinColumn(name = "cv_id")
    private Cv cv;


}
