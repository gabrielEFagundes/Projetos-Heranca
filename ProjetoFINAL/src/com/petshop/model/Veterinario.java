package com.petshop.model;

public class Veterinario extends Pessoa{

	private String registroProfissional;
	
	public Veterinario(String nome, String telefone, String registroProfissional) {
		super(nome, telefone);
		this.registroProfissional = registroProfissional;
	}
	
	public Veterinario() {
		super();
		this.registroProfissional = "";
	}

	public String getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(String registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
}
