package com.example.hrms.Repo;

import com.example.hrms.Entities.JobExperience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobExperienceRepository extends JpaRepository<JobExperience,Integer> {
}
