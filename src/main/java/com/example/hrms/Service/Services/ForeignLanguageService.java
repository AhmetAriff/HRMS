package com.example.hrms.Service.Services;

import com.example.hrms.Dtos.ForeignLanguageDto;
import com.example.hrms.Entities.ForeignLanguage;
import com.example.hrms.core.Utilities.Results.Result;

public interface ForeignLanguageService {

    Result addForeignLanguage(ForeignLanguageDto foreignLanguageDto);
}
