package com.example.hrms.Dtos;

import com.example.hrms.Entities.Cv;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class ForeignLanguageDto {


    private int foreignLanguageId;



    private String languageName;


    private int languageLevel;


    private int cvId;
}
