package com.rec.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FullStackDeveloper extends Candidate implements Backend,Frontend {

	
	public FullStackDeveloper(LocalDateTime dateOfBirth, LocalDateTime startDate, String dni, String nombre, String surname,
			ContractType ct) {
		super(dateOfBirth,startDate,dni,nombre,surname,ct);
		
	}
	
	
	
	@Override
	public Double computeWebDesignCost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double computeFEMaintenanceCost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double createWebAPIAndDBConnectionCost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double maintenanceCost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double computeGrossSalary() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String obtenerClase() {
		// TODO Auto-generated method stub
		return null;
	}

}
