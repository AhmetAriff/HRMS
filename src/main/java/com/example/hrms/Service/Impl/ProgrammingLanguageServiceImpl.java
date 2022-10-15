package com.example.hrms.Service.Impl;

import com.example.hrms.Dtos.ProgrammingLanguageDto;
import com.example.hrms.Entities.ProgrammingLanguage;
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

    @Override
    public ProgrammingLanguage addProgrammingLanguage(ProgrammingLanguageDto programmingLanguageDto) {
        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
        programmingLanguage.setProgrammingLanguageName(programmingLanguageDto.getProgrammingLanguageName());
        return programmingLanguageRepository.save(programmingLanguage);

    }
}
