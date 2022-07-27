package com.example.hrms.Controller;

import com.example.hrms.Dtos.CandidateDto;
import com.example.hrms.Service.Services.CandidatesService;
import com.example.hrms.core.Utilities.Results.DataResult;
import com.example.hrms.core.Utilities.Results.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/candidates")
@RequiredArgsConstructor

public class CandidateController {

     private final CandidatesService candidatesService;


     @PostMapping("/add")
     public ResponseEntity<?> addCandidate(@Valid @RequestBody CandidateDto candidateDto) {
         return ResponseEntity.ok(this.candidatesService.addCandidate(candidateDto));
    }

    @GetMapping("/get")
    public DataResult<List<CandidateDto>> getAllCandidates(){
         return this.candidatesService.getAllCandidates();
    }




}



