package com.example.hrms.Entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="Schools")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Schools implements Serializable {

    @Id
    @SequenceGenerator(name="seq_schools",allocationSize = 1)
    @GeneratedValue(generator = "seq_schools",strategy = GenerationType.SEQUENCE)
    private int schoolsId;

    @Column(name = "school_name",length = 100)
    private String schoolName;

    @Column(name = "start_of_school",length = 100)
    private int startOfSchool;

    @Column(name = "end_of_school",length = 100)
    private int endOfSchool;

    @ManyToMany(mappedBy = "addedSchools")
    private Set<Cv> cv  ;


}
