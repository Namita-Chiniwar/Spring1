package com.namita.citizenService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.namita.citizenService.Entity.VaccinationCenter;


@Repository
public interface VaccinationCEnterRepo extends JpaRepository<VaccinationCenter, Integer> {

}


