package com.codedecode.microservices.VaccinationCenter.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Citizen {
	
	private int id;
	
	private String name;
	
	private int vaccinationCenterId;
	

}
