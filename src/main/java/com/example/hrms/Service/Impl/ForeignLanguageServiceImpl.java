package com.example.hrms.Service.Impl;

import com.example.hrms.Dtos.ForeignLanguageDto;
import com.example.hrms.Entities.ForeignLanguage;
import com.example.hrms.Repo.CvRepository;
import com.example.hrms.Repo.ForeignLanguageRepository;
import com.example.hrms.Service.Services.ForeignLanguageService;
import com.example.hrms.core.Utilities.Results.Result;
import com.example.hrms.core.Utilities.Results.SuccessResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class  ForeignLanguageServiceImpl implements ForeignLanguageService {

    private final ForeignLanguageRepository foreignLanguageRepository;
    private final CvRepository cvRepository;
    @Override
    public Result addForeignLanguage(ForeignLanguageDto foreignLanguageDto) {

       ForeignLanguage foreignLanguage=new ForeignLanguage();
       foreignLanguage.setLanguageName(foreignLanguageDto.getLanguageName());
       foreignLanguage.setLanguageLevel(foreignLanguageDto.getLanguageLevel());
       foreignLanguage.setCv(cvRepository.findCvByCvId(foreignLanguageDto.getCvId()));
       this.foreignLanguageRepository.save(foreignLanguage);
       return  new SuccessResult("foreign language added to db");
    }
}
