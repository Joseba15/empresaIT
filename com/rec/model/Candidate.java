package com.rec.model;

import java.time.LocalDate;
import java.time.LocalDateTime;



public abstract class Candidate implements Comparable<Candidate> {
	private LocalDateTime dateOfBirth;
	private LocalDateTime startDate;
	private String dni;
	private String nombre;
	private String surname;
	private ContractType ct;
	private boolean inProject;
	
	public Candidate(){}
	
	
	
	
	public Candidate(LocalDateTime dateOfBirth, LocalDateTime startDate, String dni, String nombre, String surname,
			ContractType ct) {
		super();
		this.dateOfBirth = dateOfBirth;
		this.startDate = startDate;
		this.dni = dni;
		this.nombre = nombre;
		this.surname = surname;
		this.ct = ct;
	}




	public abstract Double computeGrossSalary();
		
	
	

	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public ContractType getCt() {
		return ct;
	}

	public void setCt(ContractType ct) {
		this.ct = ct;
	}

	public boolean isInProject() {
		return inProject;
	}

	public void setInProject(boolean inProject) {
		this.inProject = inProject;
	}
	
	@Override
	public int compareTo(Candidate other) {
		
		
		int resultado=0;
		if (other!=null) {
			if (this.startDate!=null && other.getStartDate()!=null &&this.startDate.isBefore(other.getStartDate())) {
				resultado=-1;
			}else if (startDate.isAfter(other.getStartDate())) {
				resultado=1;
			}			
		}
		
		return resultado;	
		
		//return this.getCodigo-other.getCodigo;
	}




	@Override
	public String toString() {
		return "Soy "+obtenerClase();
	}
	
	public abstract String obtenerClase();
	
	

	
	
	
	
}
