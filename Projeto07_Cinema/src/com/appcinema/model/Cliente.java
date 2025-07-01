package com.appcinema.model;

public class Cliente extends Pessoa{

	private String tipoIngresso;
	
	public Cliente(String nome, String email, String tipoIngresso) {
		super(nome, email);
		this.tipoIngresso = tipoIngresso;
	}
	
	public Cliente() {
		super();
		this.tipoIngresso = "";
	}

	public String getTipoIngresso() {
		return tipoIngresso;
	}

	public void setTipoIngresso(String tipoIngresso) {
		this.tipoIngresso = tipoIngresso;
	}
	
	public void mostrarCliente() {
		System.out.printf("\nNome -> %s\nEmail -> %s\nTipo de Ingresso -> %s", getNome(), getEmail(), getTipoIngresso());
	}
}
