package com.example.hrms.Repo;

import com.example.hrms.Entities.City;
import com.example.hrms.Entities.Employers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

    City findCitiesByCityName (String cityName);
}
