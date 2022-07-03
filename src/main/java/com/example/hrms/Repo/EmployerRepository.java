package com.example.hrms.Repo;

import com.example.hrms.Entities.Employers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployerRepository extends JpaRepository<Employers, Integer> {

    Employers findEmployersByCompanyName(String companyName);

    Employers findEmployersByEmployerId(int id);

    boolean existsEmployersByCompanyName(String employerName);
}
