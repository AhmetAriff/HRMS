package com.example.hrms.Service.Impl;

import com.example.hrms.Dtos.CvDto;
import com.example.hrms.Entities.*;
import com.example.hrms.Repo.CvRepository;
import com.example.hrms.Service.Services.*;
import com.example.hrms.core.Utilities.Results.Result;
import com.example.hrms.core.Utilities.Results.SuccessResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CvServiceImpl implements CvService {
    private  final CvRepository cvRepository;
    private final SocialMediaService socialMediaService;
    private final ImageService imageService;
    private final SchoolService schoolService;
    private final ProgrammingLanguageService programmingLanguageService;
    private final JobExperienceService jobExperienceService;

    private final ForeignLanguageService foreignLanguageService;

    @Override
    public Result addCv(CvDto cvDto) {

        Cv cv = new Cv();

        SocialMedia socialMedia = this.socialMediaService.addSocialMedia(cvDto.getSocialMediaDto());
        cv.setSocialMedia(socialMedia);

        Image image = this.imageService.addImage(cvDto.getImageDto());
        cv.setImage(image);

        cv.setCoverLetter(cvDto.getCoverLetter());

        Schools schools = this.schoolService.addSchool(cvDto.getSchoolDto());
        schools.setCv(cv);

        ProgrammingLanguage programmingLanguage = this.programmingLanguageService.addProgrammingLanguage(cvDto.getProgrammingLanguageDto());
        programmingLanguage.setCv(cv);
        JobExperience jobExperience = this.jobExperienceService.addJobExperience(cvDto.getJobExperienceDto());
        jobExperience.setCv(cv);

        ForeignLanguage foreignLanguage = this.foreignLanguageService.addForeignLanguage(cvDto.getForeignLanguageDto());
        foreignLanguage.setCv(cv);


        this.cvRepository.save(cv);
        return new SuccessResult("cv olusturuldu");


    }
}
