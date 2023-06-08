package org.example;

import java.util.*;

public class Camion {

	Collection<Parte> partesCamion;
	private String patente;
	private String chofer;


	public Camion(){
	}
	public String getChofer() {
		return chofer;
	}

	public String getPatente() {
		return patente;
	}

	public void setChofer(String chofer) {
		this.chofer = chofer;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

}