package com.example.hrms.Entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="ımage")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Image implements Serializable {

    @Id
    @SequenceGenerator(name="seq_image",allocationSize = 1)
    @GeneratedValue(generator = "seq_image",strategy = GenerationType.SEQUENCE)
    private int imageId;
}
