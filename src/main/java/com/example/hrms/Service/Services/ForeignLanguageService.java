package com.example.hrms.Service.Services;

import com.example.hrms.Dtos.ForeignLanguageDto;
import com.example.hrms.Entities.ForeignLanguage;

public interface ForeignLanguageService {

    ForeignLanguage addForeignLanguage(ForeignLanguageDto foreignLanguageDto);
}
