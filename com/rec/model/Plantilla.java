package com.rec.model;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Plantilla {

	private Candidate[] trabajadores;
	
	public Plantilla() {
		int posicion=0;
		
		
		trabajadores=new Candidate[11];
		//3 desarrolladores web (1 a tiempo parcial)
		Candidate c1 = new WebDesigner(LocalDateTime.now(), LocalDateTime.now(), "123", "Joseba", "Diaz", ContractType.FULLTIME);
		c1.setCt(ContractType.PARTIAL);
		trabajadores[posicion++]= c1;
		
		Candidate c2=new WebDesigner(null, null, null, null, null, null);
		c2.setCt(ContractType.FULLTIME);
		trabajadores[posicion++]= c2;

		
		Candidate c3=new WebDesigner(null, null, null, null, null, null);
		c3.setCt(ContractType.FULLTIME);
		trabajadores[posicion++]= c3;
		

		//6 desarrolladores de Backend 
		
		Candidate b1=new BackendProgrammer();
		b1.setCt(ContractType.PARTIAL);
		trabajadores[posicion++]= b1;
		
		Candidate b2=new BackendProgrammer();
		b2.setCt(ContractType.PARTIAL);
		trabajadores[posicion++]= b2;
		
		Candidate b3=new BackendProgrammer();
		b3.setCt(ContractType.FULLTIME);
		trabajadores[posicion++]= b3;
		
		Candidate b4=new BackendProgrammer();
		b4.setCt(ContractType.FULLTIME);
		trabajadores[posicion++]= b4;
		
		Candidate b5=new BackendProgrammer();
		b5.setCt(ContractType.FULLTIME);
		trabajadores[posicion++]= b1;
		
		Candidate b6=new BackendProgrammer();
		b6.setCt(ContractType.FULLTIME);
		trabajadores[posicion++]= b6;

		
		
		Candidate fs1= new FullStackDeveloper(null, null, null, null, null, null);
		fs1.setCt(ContractType.FULLTIME);
		trabajadores[posicion++]= fs1;
		
		Candidate fs2= new FullStackDeveloper(null, null, null, null, null, null);
		fs2.setCt(ContractType.FULLTIME);
		trabajadores[posicion++]= fs2;

		
		
	}
	
	public String mostrarInformacion(String dni) {
		String resultado = null;
		
		for (Candidate trabajador : trabajadores) {
			if (dni.equals(trabajador.getDni())) {
				resultado=trabajador.toString();
			}
		}
		
		
		return resultado;
	}
	
	
	public String imprimirLista() {
		StringBuilder sb=new StringBuilder();
		Arrays.sort(trabajadores);
		
		for (Candidate i : trabajadores) {
			if (i!=null) {
				sb.append(i+"\n");
			}
		}
		return sb.toString();
	}
	
	
	
	
}
