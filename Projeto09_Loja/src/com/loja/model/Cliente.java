package com.loja.model;

public class Cliente extends Pessoa {

	private String preferenciaPagamento;
	
	public Cliente(String nome, String telefone, String preferenciaPagamento) {
		super(nome, telefone);
		this.preferenciaPagamento = preferenciaPagamento;
	}
	
	public Cliente() {
		super();
		this.preferenciaPagamento = "";
	}

	public String getPreferenciaPagamento() {
		return preferenciaPagamento;
	}

	public void setPreferenciaPagamento(String preferenciaPagamento) {
		this.preferenciaPagamento = preferenciaPagamento;
	}
	
	public void mostrarCliente() {
		System.out.printf("\nNome: %s\nTelefone: %s\nPreferência de pagamento: %s", getNome(), getTelefone(), getPreferenciaPagamento());
	}
}
