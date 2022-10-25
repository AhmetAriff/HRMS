package com.example.hrms.Service.Impl;

import com.example.hrms.Dtos.ImageDto;
import com.example.hrms.Entities.Image;
import com.example.hrms.Repo.CvRepository;
import com.example.hrms.Repo.ImageRepository;
import com.example.hrms.Service.Services.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService {

    private final ImageRepository imageRepository;

    private final CvRepository cvRepository;
    @Override
    public Image addImage( ImageDto imageDto) {
        Image image = new Image();
        image.setImageUrl(imageDto.getImageUrl());
        return  this.imageRepository.save(image);

    }
}
