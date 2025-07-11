package com.appclinica.model;

public class Medico extends Pessoa {

	private String especialidade;
	
	public Medico(String nome, String telefone, String especialidade) {
		super(nome, telefone);
		this.especialidade = especialidade;
	}
	
	public Medico() {
		super();
		this.especialidade = "";
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public void mostrarMedico() {
		System.out.println("\n" + getNome() + "\n" + getTelefone() + "\n" + getEspecialidade());
	}
}
