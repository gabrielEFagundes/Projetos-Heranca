package com.apphotel.services;

import java.util.Scanner;

import com.apphotel.model.Funcionario;
import com.apphotel.model.Hospede;

public class Gerenciamento {
	
	public Funcionario cadastrarFuncionario(Scanner scan) {
		Funcionario funcionario = new Funcionario();
		
		System.out.print("\nDigite o nome do funcionário: ");
		funcionario.setNome(scan.nextLine());
		
		System.out.print("\nDigite o documento do funcionário: ");
		funcionario.setDocumento(scan.nextLine());
		
		System.out.print("\nDigite a função do funcionário em nosso hotel: ");
		funcionario.setFuncao(scan.nextLine());
		
		return funcionario;
	}
	
	public Hospede cadastrarHospede(Scanner scan) {
		Hospede hospede = new Hospede();
		
		System.out.print("\nDigite o nome do hóspede: ");
		hospede.setNome(scan.nextLine());
		
		System.out.print("\nDigite o documento do hóspede para a estadia: ");
		hospede.setDocumento(scan.nextLine());
		
		System.out.print("\nDigite o número do quarto do hóspede: ");
		hospede.setNumQuarto(scan.nextInt());
		
		return hospede;
	}

}
