package com.example.hrms.Repo;

import com.example.hrms.Entities.JobPositions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionRepository extends JpaRepository<JobPositions, Integer> {

    boolean existsJobPositionsByJobName(String jobPositions);



}
