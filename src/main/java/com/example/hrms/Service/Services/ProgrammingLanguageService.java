package com.example.hrms.Service.Services;

import com.example.hrms.Dtos.ProgrammingLanguageDto;
import com.example.hrms.Entities.ProgrammingLanguage;
import com.example.hrms.core.Utilities.Results.Result;

public interface ProgrammingLanguageService {

    Result addProgrammingLanguage(ProgrammingLanguageDto programmingLanguageDto);
}
