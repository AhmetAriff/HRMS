package com.example.hrms.Service.Services;


import com.example.hrms.Dtos.CandidateDto;
import com.example.hrms.Entities.Candidates;
import com.example.hrms.core.Utilities.Results.DataResult;
import com.example.hrms.core.Utilities.Results.Result;

import java.util.List;


public interface CandidatesService {

    Result addCandidate(CandidateDto candidateDto);

    void deleteCandidate(Candidates candidates);

    void updateCandidates(Candidates candidates);

    DataResult<List<CandidateDto>> getAllCandidates();





}
