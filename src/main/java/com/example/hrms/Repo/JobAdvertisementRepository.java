package com.example.hrms.Repo;

import com.example.hrms.Entities.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobAdvertisementRepository extends JpaRepository<JobAdvertisement, Integer> {

    List<JobAdvertisement> findJobAdvertisementByEmployersCompanyNameAndStatus(String employerName,boolean status);

    List<JobAdvertisement> findJobAdvertisementByStatus(boolean status);

    List<JobAdvertisement>findJobAdvertisementByStatusOrderByDeadlineAsc(boolean status);

    JobAdvertisement getJobAdvertisementById(int id);
}
