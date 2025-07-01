package com.appacademia;

import java.util.Scanner;

import com.appacademia.model.Aluno;
import com.appacademia.model.Instrutor;
import com.appacademia.services.Matriculador;

public class App {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		Matriculador matriculador = new Matriculador();
		
		System.out.println("\n+====--< CADASTRAR INSTRUTOR >--====+");
		Instrutor instrutor = matriculador.cadastrarInstrutor(scan);
		
		System.out.println("\n\n+====--< CADASTRAR ALUNO >--====+");
		Aluno aluno = matriculador.cadastrarAluno(scan);
		
		System.out.println("\n\n+====--< DADOS RESULTANTES >--====+");
		System.out.println("\nInstrutor: ");
		instrutor.mostrarInstrutor();
		System.out.println("\n\nAluno: ");
		aluno.mostrarAluno();
	}

}
