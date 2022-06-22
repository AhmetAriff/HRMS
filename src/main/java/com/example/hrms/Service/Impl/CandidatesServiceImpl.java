package com.example.hrms.Service.Impl;

import com.example.hrms.Dto.CandidatesDto;
import com.example.hrms.Entities.Candidates;
import com.example.hrms.Repo.CandidateRepository;
import com.example.hrms.Service.Services.CandidatesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CandidatesServiceImpl implements CandidatesService {

    private final CandidateRepository candidateRepository;

    @Override
    public CandidatesDto addCandidate(CandidatesDto candidatesDto) {

        Candidates candidate = new Candidates();
        candidate.setFirstName(candidatesDto.getFirstName());
        candidate.setLastName(candidatesDto.getLastName());
        candidate.setIdentityNumber(candidatesDto.getIdentityNumber());
        candidate.setBirthDate(candidatesDto.getBirthDate());

        candidateRepository.save(candidate);

        candidatesDto.setCandidatesId(candidate.getCandidatesId());
        return candidatesDto;


    }

    @Override
    public void deleteCandidate(CandidatesDto candidatesDto) {

    }

    @Override
    public void updateCandidates(CandidatesDto candidatesDto) {

    }
}
