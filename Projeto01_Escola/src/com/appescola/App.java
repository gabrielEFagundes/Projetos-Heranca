package com.appescola;

import java.util.Scanner;

import com.appescola.model.Aluno;
import com.appescola.model.Professor;
import com.appescola.service.CadastroService;

public class App {
	
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		CadastroService cadastro = new CadastroService();
		
		System.out.println("\n+====== Cadastro do aluno ======+");
		Aluno aluno = cadastro.cadastrarAluno(scan);
		
		System.out.println("\n\n+====== Cadastro do professor ======+");
		Professor professor = cadastro.cadastrarProfessor(scan);
		
		System.out.println("\n\n+====== DADOS ======+");
		aluno.mostrarAluno();
		System.out.println();
		professor.mostrarProfessor();
		
	}

}
