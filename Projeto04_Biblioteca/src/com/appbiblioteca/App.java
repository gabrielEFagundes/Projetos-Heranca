package com.appbiblioteca;

import java.util.Scanner;

import com.appbiblioteca.model.Leitor;
import com.appbiblioteca.model.Bibliotecario;
import com.appbiblioteca.services.Cadastro;

public class App {
	
	public static void main(String [] args) {
		
		Cadastro cadastro = new Cadastro();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n\n+====== CADASTRO BIBLIOTECÁRIO ======+");
		Bibliotecario bibliotecario = cadastro.cadastrarBibliotecario(scan);
		
		System.out.println("\n+====== CADASTRO LEITOR ======+");
		Leitor leitor = cadastro.cadastrarLeitor(scan);
		
		System.out.println("\n\n+====== DADOS CADASTRADOS ======+");
		System.out.println("-> Bibliotecário:");
		bibliotecario.mostrarBibliotecario();
		System.out.println("\n\n-> Leitor:");
		leitor.mostrarLeitor();
		
	}

}
