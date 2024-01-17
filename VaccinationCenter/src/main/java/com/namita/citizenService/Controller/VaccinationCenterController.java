package com.namita.citizenService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.namita.citizenService.Entity.VaccinationCenter;
import com.namita.citizenService.Service.VaccinationCenterService;

//import com.namita.VaccinationCenter.Entity.VaccinationCenter;
//import com.namita.VaccinationCenter.Service.VaccinationCenterService;

@RestController
@RequestMapping("/vaccinationCenter")
public class VaccinationCenterController {
	
	
	@Autowired
	private VaccinationCenterService vaccinationCenterService;
	
	@GetMapping("/test")
	public ResponseEntity<String> testMethod() {
		return new ResponseEntity<>("Hello", HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public String addCenters(@RequestBody VaccinationCenter vaccinationCenter){
		return vaccinationCenterService.addCenter(vaccinationCenter);
	}
	
	

}
