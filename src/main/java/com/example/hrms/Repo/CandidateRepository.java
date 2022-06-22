package com.example.hrms.Repo;

import com.example.hrms.Entities.Candidates;
import com.example.hrms.Entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidates, Integer> {



}
