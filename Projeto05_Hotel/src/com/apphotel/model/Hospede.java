package com.apphotel.model;

public class Hospede extends Pessoa{

	private int numQuarto;
	
	public Hospede(String nome, String documento, int numQuarto) {
		super(nome, documento);
		this.numQuarto = numQuarto;
	}
	
	public Hospede() {
		super();
		this.numQuarto = 0;
	}

	public int getNumQuarto() {
		return numQuarto;
	}

	public void setNumQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}
	
	public void mostrarHospede() {
		System.out.printf("\n%s\n%s\n%d", getNome(), getDocumento(), getNumQuarto());
	}
}
