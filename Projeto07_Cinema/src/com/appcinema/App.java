package com.appcinema;

import java.util.Scanner;

import com.appcinema.model.Funcionario;
import com.appcinema.model.Cliente;
import com.appcinema.services.VendedorIngresso;

public class App {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		VendedorIngresso vendedor = new VendedorIngresso();
		
		System.out.println("\n+====--< CADASTRO DE FUNCIONÁRIO >--====+");
		Funcionario funcionario = vendedor.cadastrarFuncionario(scan);
		
		System.out.println("\n\n+====--< CADASTRO DE CLIENTE >--====+");
		Cliente cliente = vendedor.cadastrarCliente(scan);
		
		System.out.println("\n\n+====--< FETCHED RESULTS >--====+");
		System.out.println("\nFuncionário: ");
		funcionario.mostrarFuncionario();
		System.out.println("\nCliente: ");
		cliente.mostrarCliente();
	}
}
