package com.example.hrms.Repo;

import com.example.hrms.Entities.SocialMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialMediaRepository extends JpaRepository<SocialMedia,Integer> {
}
