package com.example.hrms.Service.Impl;

import com.example.hrms.Dtos.CvDto;
import com.example.hrms.Entities.Cv;
import com.example.hrms.Entities.Image;
import com.example.hrms.Entities.Schools;
import com.example.hrms.Entities.SocialMedia;
import com.example.hrms.Repo.CvRepository;
import com.example.hrms.Service.Services.CvService;
import com.example.hrms.Service.Services.ImageService;
import com.example.hrms.Service.Services.SchoolService;
import com.example.hrms.Service.Services.SocialMediaService;
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

    @Override
    public Result addCv(CvDto cvDto) {

        Cv cv = new Cv();

        SocialMedia socialMedia = this.socialMediaService.addSocialMedia(cvDto.getSocialMediaDto());
        cv.setSocialMedia(socialMedia);

        Image image=this.imageService.addImage(cvDto.getImageDto());
        cv.setImage(image);

        cv.setCoverLetter(cvDto.getCoverLetter());

        this.cvRepository.save(cv);
        return new SuccessResult("cv olusturuldu");




    }
}
