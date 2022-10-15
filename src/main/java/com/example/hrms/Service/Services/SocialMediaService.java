package com.example.hrms.Service.Services;

import com.example.hrms.Dtos.SocialMediaDto;
import com.example.hrms.Entities.SocialMedia;
import com.example.hrms.core.Utilities.Results.Result;



public interface SocialMediaService {

     SocialMedia addSocialMedia(SocialMediaDto socialMediaDto);
}
