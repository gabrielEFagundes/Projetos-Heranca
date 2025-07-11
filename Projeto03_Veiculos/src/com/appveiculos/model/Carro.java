package com.appveiculos.model;

public class Carro extends Veiculo {

	private int numPortas;
	
	public Carro(String placa, String marca, int numPortas) {
		super(placa, marca);
		this.numPortas = numPortas;
	}
	
	public Carro() {
		super();
		this.numPortas = 0;
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	
	public void mostrarCarro() {
		System.out.println("\n" + getPlaca() + "\n" + getMarca() + "\n" + getNumPortas());
	}
}
