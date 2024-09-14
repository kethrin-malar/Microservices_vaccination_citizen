package com.codedecode.microservices.VaccinationCenter.Model;

import java.util.List;

import com.codedecode.microservices.VaccinationCenter.Entity.VaccinationCenter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequiredResponse {
	
	private VaccinationCenter center;
	private List<Citizen> citizens;
	public void setCenter(VaccinationCenter center2) {
		// TODO Auto-generated method stub
		
	}
	public void setCitizens(List<Citizen> listOfCitizens) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}

