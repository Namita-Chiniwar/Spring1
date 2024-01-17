package com.namita.citizenService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.namita.citizenService.Entity.VaccinationCenter;
import com.namita.citizenService.Repository.VaccinationCEnterRepo;

@Service
public class VaccinationCenterService {
	
	@Autowired
	private VaccinationCEnterRepo vaccinationCenterRepo;

	public String addCenter(VaccinationCenter vaccinationCenter) {
		vaccinationCenterRepo.save(vaccinationCenter);
		return "Success";
		
	}

	
	

}


