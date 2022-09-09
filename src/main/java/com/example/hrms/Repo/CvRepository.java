package com.example.hrms.Repo;

import com.example.hrms.Entities.Cv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CvRepository extends JpaRepository<Cv,Integer> {
}
