package com.apphotel;

import java.util.Scanner;

import com.apphotel.model.Funcionario;
import com.apphotel.model.Hospede;
import com.apphotel.services.Gerenciamento;

public class App {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		Gerenciamento gerenciamento = new Gerenciamento();
		
		System.out.println("\n+====-- CADASTRO FUNCIONÁRIO --====+");
		Funcionario funcionario = gerenciamento.cadastrarFuncionario(scan);
		
		System.out.println("\n\n+====-- CADASTRO HÓSPEDE --====+");
		Hospede hospede = gerenciamento.cadastrarHospede(scan);
		
		System.out.println("\n\n+====-- DADOS FINAIS --====+");
		System.out.println("\nFuncionário: ");
		funcionario.mostrarFuncionario();
		
		System.out.println("\n\nHóspede: ");
		hospede.mostrarHospede();
	}

}
