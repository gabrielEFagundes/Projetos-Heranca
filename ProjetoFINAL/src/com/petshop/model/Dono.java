package com.petshop.model;

public class Dono extends Pessoa{

	private String nomePet;
	
	public Dono(String nome, String telefone, String nomePet) {
		super(nome, telefone);
		this.nomePet = nomePet;
	}
	
	public Dono() {
		super();
		this.nomePet = "";
	}

	public String getNomePet() {
		return nomePet;
	}

	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}
}
