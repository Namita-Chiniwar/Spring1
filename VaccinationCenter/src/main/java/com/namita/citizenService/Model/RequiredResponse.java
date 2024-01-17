package com.namita.citizenService.Model;

import java.util.List;

import com.namita.citizenService.Entity.VaccinationCenter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequiredResponse {
	
	private VaccinationCenter center;
	private List<Citizen> citizens;
	
	
}


