package com.rec.model;

public interface Frontend {

	public static final Double WEB_API_DB_COST=2100.0;
	public static final Double FE_MAINTENANCE_COST=700.0;
	
	/**
	 * Calcula el coste de crear una xonexion a base de datos 
	 *desde el backend y crear su corresponddiente API web
	 * @return Coste de desarrollo en backend
	 */
	
	public Double computeWebDesignCost();
	
	public Double computeFEMaintenanceCost();
	
}
