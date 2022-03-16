package com.rec.main;

import com.rec.model.Plantilla;

public class MainApp {

	public static void main(String[] args) {
		
		Plantilla p1 = new Plantilla();
		
		System.out.println(p1.mostrarInformacion("123"));
		System.out.println(p1.imprimirLista());
		
		/*
		LocalDateTime fechaAnterior=LocalDateTime.of(2000, 2, 2, 15, 20,33);
		LocalDateTime fechaPosterior= fechaAnterior.plusYears(10);
		
		BackendProgrammer bp1= new BackendProgrammer();
		bp1.setStartDate(fechaAnterior);
		BackendProgrammer bp2 = new BackendProgrammer();
		*/ 
		
	}

}
