package com.loja.services;

import java.util.Scanner;

import com.loja.model.Cliente;
import com.loja.model.Vendedor;

public class CadastroClientes {

	public Cliente cadastrarCliente(Scanner scan) {
		Cliente cliente = new Cliente();
		
		System.out.print("\nDigite o nome do freguês: ");
		cliente.setNome(scan.nextLine());
		
		System.out.print("\nDigite o telefone do freguês: ");
		cliente.setTelefone(scan.nextLine());
		
		System.out.print("\nDigite a forma de pagamento preferencial do freguês: ");
		cliente.setPreferenciaPagamento(scan.nextLine());
		
		return cliente;
	}
	
	public Vendedor cadastrarFuncionario(Scanner scan) {
		Vendedor vendedor = new Vendedor();
		
		System.out.print("\nDigite o nome do nosso funcionário: ");
		vendedor.setNome(scan.nextLine());
		
		System.out.print("\nDigite o telefone do funcionário: ");
		vendedor.setTelefone(scan.nextLine());
		
		System.out.print("\nDigite a meta mensal de vendas do vendedor: ");
		vendedor.setMetaMensal(scan.nextDouble());
		scan.nextLine();
		
		return vendedor;
	}
	
}
