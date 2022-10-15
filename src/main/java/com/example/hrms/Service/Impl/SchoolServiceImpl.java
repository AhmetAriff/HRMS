package com.example.hrms.Service.Impl;

import com.example.hrms.Dtos.SchoolDto;
import com.example.hrms.Entities.Schools;
import com.example.hrms.Repo.CvRepository;
import com.example.hrms.Repo.SchoolsRepository;
import com.example.hrms.Service.Services.SchoolService;
import com.example.hrms.core.Utilities.Results.Result;
import com.example.hrms.core.Utilities.Results.SuccessResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService {

    private final SchoolsRepository schoolsRepository;
    private final CvRepository cvRepository;

    @Override
    public Schools addSchool(SchoolDto schoolDto) {
        Schools schools=new Schools();
        schools.setSchoolName(schoolDto.getSchoolName());
        schools.setStartOfSchool(schoolDto.getStartOfSchool());
        schools.setEndOfSchool(schoolDto.getEndOfSchool());
        schools.setCv(this.cvRepository.findCvByCvId(schoolDto.getCvId()));
        return schoolsRepository.save(schools);



    }
}
