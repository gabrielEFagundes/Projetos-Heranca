package com.ong.model;

public class Pessoa {
	
	protected String nome;
	protected String cidade;
	
	public Pessoa(String nome, String cidade) {
		this.nome = nome;
		this.cidade = cidade;
	}
	
	public Pessoa() {
		this.nome = "";
		this.cidade = "";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}
