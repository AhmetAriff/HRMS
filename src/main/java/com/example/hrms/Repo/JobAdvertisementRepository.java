package com.example.hrms.Repo;

import com.example.hrms.Entities.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobAdvertisementRepository extends JpaRepository<JobAdvertisement,Integer> {
}
