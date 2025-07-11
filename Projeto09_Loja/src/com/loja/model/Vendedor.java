package com.loja.model;

public class Vendedor extends Pessoa {
	
	private double metaMensal;
	
	public Vendedor(String nome, String telefone, double metaMensal) {
		super(nome, telefone);
		this.metaMensal = metaMensal;
	}
	
	public Vendedor() {
		super();
		this.metaMensal = 0.0;
	}

	public double getMetaMensal() {
		return metaMensal;
	}

	public void setMetaMensal(double metaMensal) {
		this.metaMensal = metaMensal;
	}
	
	public void mostrarVendedor() {
		System.out.printf("\nNome: %s\nTelefone: %s\nMeta Mensal: R$%.2f", getNome(), getTelefone(), getMetaMensal());
	}
}
