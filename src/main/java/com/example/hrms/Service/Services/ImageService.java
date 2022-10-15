package com.example.hrms.Service.Services;

import com.example.hrms.Dtos.ImageDto;
import com.example.hrms.Entities.Image;

public interface ImageService {

    Image addImage(ImageDto imageDto);
}
