package com.example.hrms.Repo;

import com.example.hrms.Entities.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobAdvertisementRepository extends JpaRepository<JobAdvertisement, Integer> {

    List<JobAdvertisement> findJobAdvertisementByEmployersCompanyName(String employerName);
}
