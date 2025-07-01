package com.apphotel.model;

public class Funcionario extends Pessoa{
	
	private String funcao;
	
	public Funcionario(String nome, String documento, String funcao) {
		super(nome, documento);
		this.funcao = funcao;
	}
	
	public Funcionario() {
		super();
		this.funcao = "";
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public void mostrarFuncionario() {
		System.out.printf("\n%s\n%s\n%s", getNome(), getDocumento(), getFuncao());
	}
}
