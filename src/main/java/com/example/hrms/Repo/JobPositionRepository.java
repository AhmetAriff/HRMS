package com.example.hrms.Repo;

import com.example.hrms.Entities.JobPositions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobPositionRepository extends JpaRepository<JobPositions, Integer> {

    boolean existsJobPositionsByJobName(String jobPositions);

    JobPositions findJobPositionsByJobName(String jobName);


}
