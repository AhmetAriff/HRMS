package com.example.hrms.Controller;

import com.example.hrms.Dtos.CityDto;
import com.example.hrms.Dtos.CvDto;
import com.example.hrms.Service.Services.CvService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/cvs")
@RequiredArgsConstructor
public class CvController {

    private final CvService cvService;

    @PostMapping
    public ResponseEntity<?> addCv(@Valid @RequestBody CvDto cvDto)
    {
        return ResponseEntity.ok(this.cvService.addCv(cvDto));
    }
}
