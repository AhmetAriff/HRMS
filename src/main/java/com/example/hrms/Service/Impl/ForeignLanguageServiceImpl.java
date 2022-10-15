package com.example.hrms.Service.Impl;

import com.example.hrms.Dtos.ForeignLanguageDto;
import com.example.hrms.Entities.ForeignLanguage;
import com.example.hrms.Repo.ForeignLanguageRepository;
import com.example.hrms.Service.Services.ForeignLanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class  ForeignLanguageServiceImpl implements ForeignLanguageService {

    private final ForeignLanguageRepository foreignLanguageRepository;
    @Override
    public ForeignLanguage addForeignLanguage(ForeignLanguageDto foreignLanguageDto) {

       ForeignLanguage foreignLanguage=new ForeignLanguage();
       foreignLanguage.setLanguageName(foreignLanguageDto.getLanguageName());
       foreignLanguage.setLanguageLevel(foreignLanguageDto.getLanguageLevel());
       return this.foreignLanguageRepository.save(foreignLanguage);
    }
}
