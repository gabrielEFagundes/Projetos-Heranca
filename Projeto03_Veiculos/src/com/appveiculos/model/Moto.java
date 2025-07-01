package com.appveiculos.model;

public class Moto extends Veiculo{
	
	private boolean cilindrada;
	
	public Moto(String placa, String marca, boolean cilindrada) {
		super(placa, marca);
		this.cilindrada = cilindrada;
	}
	
	public Moto() {
		super();
		this.cilindrada = false;
	}

	public boolean isCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(boolean cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public void mostrarMoto() {
		System.out.println("\n" + getPlaca() + "\n" + getMarca() + "\n" + isCilindrada());
	}
}
