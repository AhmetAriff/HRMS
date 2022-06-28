package com.example.hrms.Service.Impl;

import com.example.hrms.Dtos.CandidateDto;
import com.example.hrms.Entities.Candidates;
import com.example.hrms.Entities.User;
import com.example.hrms.Repo.CandidateRepository;
import com.example.hrms.Service.Services.CandidatesService;
import com.example.hrms.Service.Services.UserService;
import com.example.hrms.core.Utilities.Results.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



@Service
@RequiredArgsConstructor
public class CandidatesServiceImpl implements CandidatesService {

    private final CandidateRepository candidateRepository;
    private  final UserService userService;



    @Override
    public Result addCandidate(CandidateDto candidateDto) {
        if(this.userService.isMailExist(candidateDto.getUserDto().getMail())) {
            return new ErrorResult("Mail already exist");

        } else if (this.candidateRepository.existsCandidatesByIdentityNumber(candidateDto.getIdentityNumber())) {
            return new ErrorResult("Identity number already exist");
        } else if (!this.userService.isMailEnable(candidateDto.getUserDto())) {
            return new ErrorResult("Mail is not enabled");
        }

        else {


            Candidates candidates = new Candidates();
            candidates.setFirstName(candidateDto.getFirstName());
            candidates.setBirthDate(candidateDto.getBirthDate());
            candidates.setLastName(candidateDto.getLastName());
            candidates.setIdentityNumber(candidateDto.getIdentityNumber());

            User user = userService.addUser(candidateDto.getUserDto());
            candidates.setUser(user);

            this.candidateRepository.save(candidates);
            return new SuccessResult("candidate added to DB");
        }


    }

    @Override
    public void deleteCandidate(Candidates candidates) {

    }

    @Override
    public void updateCandidates(Candidates candidates) {

    }

    @Override
    public DataResult<List<CandidateDto>> getAllCandidates() {


            List<Candidates> candidates =candidateRepository.findAll();

            List<CandidateDto> candidateDtos = new ArrayList<>();

            candidates.forEach(it -> {

                CandidateDto candidateDto = new CandidateDto();

                candidateDto.setCandidatesId(it.getCandidatesId());
                candidateDto.setFirstName(it.getFirstName());
                candidateDto.setLastName(it.getLastName());
                candidateDto.setBirthDate(it.getBirthDate());
                candidateDto.setUserDto(userService.convertUserDto(it.user));
                candidateDtos.add(candidateDto);
            });
             return new SuccesDataResult<List<CandidateDto>>(candidateDtos,"candidates listed succesfuly");



    }


}
