package org.example;

public class CamionUtil extends Camion {

	Empresa empresa;
	private String estadoCamion;

	public CamionUtil(){

	}

	public String getEstadoCamion() {
		return estadoCamion;
	}


	public void setEstadoCamion(String estadoCamion) {
		this.estadoCamion = estadoCamion;
	}

}