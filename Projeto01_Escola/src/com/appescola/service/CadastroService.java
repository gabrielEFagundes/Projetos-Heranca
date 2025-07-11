package com.appescola.service;

import java.util.Scanner;

import com.appescola.model.*;

public class CadastroService {
	
	public Professor cadastrarProfessor(Scanner scan) {
		Professor professor = new Professor();
		
		scan.nextLine();
		
		System.out.print("\nDigite o nome do Professor: ");
		professor.setNome(scan.nextLine());
		
		System.out.print("\nDigite o email do Professor: ");
		professor.setEmail(scan.nextLine());
		
		System.out.print("\nDigite a disciplina do professor: ");
		professor.setDisciplina(scan.nextLine());
		
		return professor;
	}
	
	public Aluno cadastrarAluno(Scanner scan) {
		Aluno aluno = new Aluno();
		
		System.out.print("\nDigite o nome do aluno: ");
		aluno.setNome(scan.nextLine());
		
		System.out.print("\nDigite o email do aluno: ");
		aluno.setEmail(scan.nextLine());
		
		System.out.print("\nDigite a série do aluno: ");
		aluno.setSerie(scan.nextInt());
		
		return aluno;
	}
	
}
