package com.example.hrms.Repo;

import com.example.hrms.Entities.SystemPersonal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalRepository  extends JpaRepository<SystemPersonal, Integer> {
}
