package com.apphotel.model;

public class Pessoa {
	
	protected String nome;
	protected String documento;
	
	public Pessoa(String nome, String documento) {
		this.nome = nome;
		this.documento = documento;
	}
	
	public Pessoa() {
		this.nome = "";
		this.documento = "";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}
}
