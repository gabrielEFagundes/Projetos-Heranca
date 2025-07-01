package com.appbiblioteca.services;

import java.util.Scanner;

import com.appbiblioteca.model.Leitor;
import com.appbiblioteca.model.Bibliotecario;

public class Cadastro {
	
	public Leitor cadastrarLeitor(Scanner scan) {
		Leitor leitor = new Leitor();
		
		scan.nextLine();
		
		System.out.print("\nComo é o nome do leitor: ");
		leitor.setNome(scan.nextLine());
		
		System.out.print("\nQual o CPF do leitor: ");
		leitor.setCpf(scan.nextLine());
		
		System.out.print("\nQual a matrícula do leitor: ");
		leitor.setMatricula(scan.nextLine());
		
		return leitor;
	}
	
	public Bibliotecario cadastrarBibliotecario(Scanner scan) {
		Bibliotecario bibliotecario = new Bibliotecario();
		
		System.out.print("\nDigita o nome do bibliotecário, por favor: ");
		bibliotecario.setNome(scan.nextLine());
		
		System.out.print("\nDigita o CPF do bibliotecário: ");
		bibliotecario.setCpf(scan.nextLine());
		
		System.out.print("\nQual o turno do bibliotecário (D- Dia / N- Noite): ");
		bibliotecario.setTurno(scan.next().charAt(0));
		
		return bibliotecario;
	}
	
}
