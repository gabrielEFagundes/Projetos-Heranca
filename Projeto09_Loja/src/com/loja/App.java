package com.loja;

import java.util.Scanner;

import com.loja.model.Cliente;
import com.loja.model.Vendedor;
import com.loja.services.CadastroClientes;

public class App {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		CadastroClientes cadastro = new CadastroClientes();
		
		System.out.println("\n+====--< CADASTRO DO CLIENTE >--====+");
		Cliente cliente = cadastro.cadastrarCliente(scan);
		
		System.out.println("\n\n+====--< CADASTRO DO VENDEDOR >--====+");
		Vendedor vendedor = cadastro.cadastrarFuncionario(scan);
		
		System.out.println("\n\n+====--< FETCHED DATA >--====+");
		System.out.println("\nVendedor / Funcionário: ");
		vendedor.mostrarVendedor();
		
		System.out.println("\n\nCliente: ");
		cliente.mostrarCliente();
		
	}

}
