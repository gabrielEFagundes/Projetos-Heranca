package com.appacademia.services;

import java.util.Scanner;

import com.appacademia.model.Aluno;
import com.appacademia.model.Instrutor;

public class Matriculador {

	public Aluno cadastrarAluno(Scanner scan) {
		Aluno aluno = new Aluno();
		
		System.out.print("\nDigite o nome do aluno -> ");
		aluno.setNome(scan.nextLine());
		
		System.out.print("\nDigite a idade do aluno -> ");
		aluno.setIdade(scan.nextInt());
		scan.nextLine();
		
		System.out.print("\nDigite o principal objetivo do nosso querido aluno -> ");
		aluno.setObjetivo(scan.nextLine());
		
		return aluno;
	}
	
	public Instrutor cadastrarInstrutor(Scanner scan) {
		Instrutor instrutor = new Instrutor();
		
		System.out.print("\nDigite o nome do instrutor -> ");
		instrutor.setNome(scan.nextLine());
		
		System.out.print("\nDigite a idade deste instrutor -> ");
		instrutor.setIdade(scan.nextInt());
		scan.nextLine();
		
		System.out.print("\nDigite a especialidade desse instrutor: ");
		instrutor.setEspecialidade(scan.nextLine());
		
		return instrutor;
	}
	
}
