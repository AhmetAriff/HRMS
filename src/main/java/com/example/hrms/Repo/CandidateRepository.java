package com.example.hrms.Repo;

import com.example.hrms.Entities.Candidates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<Candidates, Integer> {

    boolean existsCandidatesByIdentityNumber(String identityNumber);
}
