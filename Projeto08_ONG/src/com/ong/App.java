package com.ong;

import java.util.Scanner;

import com.ong.model.Coordenador;
import com.ong.model.Voluntario;
import com.ong.services.StockONG;

public class App {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		StockONG stock = new StockONG();
		
		System.out.println("\n+====--< CADASTRAR COORDENADOR >--====+");
		Coordenador coordenador = stock.cadastrarCoordenador(scan);
		
		System.out.println("\n\n====--< CADASTRAR VOLUNTÁRIO >--====+");
		Voluntario voluntario = stock.cadastrarVoluntario(scan);
		
		System.out.println("\n\n+====--< FETCH ALL DATA >--====+");
		System.out.println("\nCoordenador: ");
		coordenador.mostrarCoordenador();
		
		System.out.println("\n\nVoluntário: ");
		voluntario.mostrarVoluntario();
		
	}

}
