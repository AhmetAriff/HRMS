package com.example.hrms.Service.Services;

import com.example.hrms.Dto.CandidatesDto;

public interface CandidatesService {

    CandidatesDto addCandidate(CandidatesDto candidatesDto);

    void deleteCandidate(CandidatesDto candidatesDto);

    void updateCandidates(CandidatesDto candidatesDto);



}
