package com.example.hrms.Service.Impl;

import com.example.hrms.Dtos.SocialMediaDto;
import com.example.hrms.Entities.SocialMedia;
import com.example.hrms.Repo.SocialMediaRepository;
import com.example.hrms.Service.Services.SocialMediaService;
import com.example.hrms.core.Utilities.Results.Result;
import com.example.hrms.core.Utilities.Results.SuccessResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SocialMediaServiceImpl implements SocialMediaService {

    private final SocialMediaRepository socialMediaRepository;

    @Override
    public SocialMedia addSocialMedia(SocialMediaDto socialMediaDto) {
        SocialMedia socialMedia = new SocialMedia();
        socialMedia.setGithubUrl(socialMediaDto.getGithubUrl());
        socialMedia.setLinkednUrl(socialMediaDto.getLinkednUrl());
        socialMediaRepository.save(socialMedia);
       return this.socialMediaRepository.save(socialMedia);
    }
}
