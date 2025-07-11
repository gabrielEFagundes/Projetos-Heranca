package com.ong.services;

import java.util.Scanner;

import com.ong.model.Coordenador;
import com.ong.model.Voluntario;

public class StockONG {

	public Coordenador cadastrarCoordenador(Scanner scan) {
		Coordenador coordenador = new Coordenador();
		
		System.out.print("\nDigite o nome do coordenador: ");
		coordenador.setNome(scan.nextLine());
		
		System.out.print("\nDigite a cidade do coordenador da ONG: ");
		coordenador.setCidade(scan.nextLine());
		
		System.out.print("\nDigite qual a responsabilidade do coordenador (setor de responsabilidade): ");
		coordenador.setResponsabilidade(scan.nextLine());
		
		return coordenador;
	}
	
	public Voluntario cadastrarVoluntario(Scanner scan) {
		Voluntario voluntario = new Voluntario();
		
		System.out.print("\nNome do voluntário: ");
		voluntario.setNome(scan.nextLine());
		
		System.out.print("\nCidade do voluntário: ");
		voluntario.setAreaAtuacao(scan.nextLine());
		
		System.out.print("\nÁrea que atuará: ");
		voluntario.setAreaAtuacao(scan.nextLine());
		
		return voluntario;
	}
	
}
