package com.example.hrms.Dtos;

import com.example.hrms.Entities.Cv;
import lombok.Data;

import javax.persistence.*;

@Data
public class ProgrammingLanguageDto {


    private int programmingLanguageId;


    private String programmingLanguageName;


    private int cvId;
}
