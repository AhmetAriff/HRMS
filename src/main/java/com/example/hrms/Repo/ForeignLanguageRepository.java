package com.example.hrms.Repo;

import com.example.hrms.Entities.ForeignLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForeignLanguageRepository extends JpaRepository<ForeignLanguage,Integer> {
}
