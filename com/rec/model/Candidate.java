package com.rec.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import bloc.com.notas.Nota;

public abstract class Candidate implements Comparable<Candidate> {
	private LocalDate dateOfBirth;
	private LocalDateTime startDate;
	private String dni;
	private String nombre;
	private String surname;
	private ContractType ct;
	private boolean inProject;
	
	public Candidate(){}
	
	
	/*
	public abstract Double computeGrossSalary() {
	return 0.0;
	}
	*/
	
	

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
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
			if (this.fechaCreacion.isBefore(other.fechaCreacion)) {
				resultado=-1;
			}else if (this.fechaCreacion.isAfter(other.fechaCreacion)) {
				resultado=1;
			}			
		}
		
		return -resultado;	
		
		//return this.getCodigo-other.getCodigo;
	}

	
	
	
	
}
