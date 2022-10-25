package com.example.hrms.Repo;

import com.example.hrms.Entities.Schools;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolsRepository extends JpaRepository<Schools,Integer> {

    Schools findSchoolsBySchoolsId(int schoolId);
}
