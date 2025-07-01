package com.appveiculos;

import java.util.Scanner;

import com.appveiculos.model.Carro;
import com.appveiculos.model.Moto;
import com.appveiculos.services.CadastroService;

public class App {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		CadastroService cadastro = new CadastroService();
		
		System.out.println("\n+====== CADASTRO CARRO ======+");
		Carro carro = cadastro.cadastrarCarro(scan);
		
		System.out.println("\n\n+====== CADASTRO MOTO ======+");
		Moto moto = cadastro.cadastrarMoto(scan);
		
		System.out.println("\n\n+====== DADOS TOP ======+");
		carro.mostrarCarro();
		System.out.println();
		moto.mostrarMoto();
		
	}

}
