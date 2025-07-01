package com.appacademia.model;

public class Instrutor extends Pessoa{

	private String especialidade;
	
	public Instrutor(String nome, int idade, String especialidade) {
		super(nome, idade);
		this.especialidade = especialidade;
	}
	
	public Instrutor() {
		super();
		this.especialidade = "";
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public void mostrarInstrutor() {
		System.out.printf("%s\n%d anos\n%s", getNome(), getIdade(), getEspecialidade());
	}
}
