package com.example.hrms.Service.Impl;

import com.example.hrms.Dtos.ProgrammingLanguageDto;
import com.example.hrms.Entities.ProgrammingLanguage;
import com.example.hrms.Repo.CvRepository;
import com.example.hrms.Repo.ProgrammingLanguageRepository;
import com.example.hrms.Service.Services.ProgrammingLanguageService;
import com.example.hrms.core.Utilities.Results.Result;
import com.example.hrms.core.Utilities.Results.SuccessResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProgrammingLanguageServiceImpl implements ProgrammingLanguageService {

    private final ProgrammingLanguageRepository programmingLanguageRepository;
    private final CvRepository  cvRepository;

    @Override
    public Result addProgrammingLanguage(ProgrammingLanguageDto programmingLanguageDto) {
        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
        programmingLanguage.setProgrammingLanguageName(programmingLanguageDto.getProgrammingLanguageName());
        programmingLanguage.setCv(cvRepository.findCvByCvId(programmingLanguageDto.getCvId()));
        this.programmingLanguageRepository.save(programmingLanguage);
        return new SuccessResult("programming language added to cv");

    }
}
