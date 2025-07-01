package com.appclinica.model;

public class Paciente extends Pessoa{

	private String planoSaude;
	
	public Paciente(String nome, String telefone, String planoSaude) {
		super(nome, telefone);
		this.planoSaude = planoSaude;
	}
	
	public Paciente() {
		super();
		this.planoSaude = "";
	}

	public String getPlanoSaude() {
		return planoSaude;
	}

	public void setPlanoSaude(String planoSaude) {
		this.planoSaude = planoSaude;
	}
	
	public void mostrarPaciente() {
		System.out.println("\n" + getNome() + "\n" + getTelefone() + "\n" + getPlanoSaude());
	}
}
