package com.appcinema.services;

import java.util.Scanner;

import com.appcinema.model.Funcionario;
import com.appcinema.model.Cliente;

public class VendedorIngresso {

	public Funcionario cadastrarFuncionario(Scanner scan) {
		Funcionario funcionario = new Funcionario();
		
		System.out.print("\nDigite o nome do funcionário: ");
		funcionario.setNome(scan.nextLine());
		
		System.out.print("\nDigite o email do funcionário: ");
		funcionario.setEmail(scan.nextLine());
		
		System.out.print("\nDigite o cargo do funcionário: ");
		funcionario.setCargo(scan.nextLine());
		
		return funcionario;
	}
	
	public Cliente cadastrarCliente(Scanner scan) {
		Cliente cliente = new Cliente();
		
		System.out.print("\nDigite o nome do cliente: ");
		cliente.setNome(scan.nextLine());
		
		System.out.print("\nDigite o email do cliente: ");
		cliente.setEmail(scan.nextLine());
		
		System.out.print("\nDigite o tipo de ingresso do funcionário: ");
		cliente.setTipoIngresso(scan.nextLine());
		
		return cliente;
	}
}
