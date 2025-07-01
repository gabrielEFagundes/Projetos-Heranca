package com.appcinema.model;

public class Funcionario extends Pessoa{

	private String cargo;
	
	public Funcionario(String nome, String email, String cargo) {
		super(nome, email);
		this.cargo = cargo;
	}
	
	public Funcionario() {
		super();
		this.cargo = "";
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void mostrarFuncionario() {
		System.out.printf("\nNome -> %s\nEmail de Contato -> %s\nCargo -> %s", getNome(), getEmail(), getCargo());
	}
}
