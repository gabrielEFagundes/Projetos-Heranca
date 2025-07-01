package com.appveiculos.services;

import java.util.Scanner;

import com.appveiculos.model.Carro;
import com.appveiculos.model.Moto;

public class CadastroService {

	public Carro cadastrarCarro(Scanner scan) {
		Carro carro = new Carro();
		System.out.print("\nDigite a placa do carro: ");
		carro.setPlaca(scan.nextLine());
		
		System.out.print("\nDigite a marca do carro: ");
		carro.setMarca(scan.nextLine());
		
		System.out.print("\nDigite a quantidade de portas no carro: ");
		carro.setNumPortas(scan.nextInt());
		
		return carro;
	}
	
	public Moto cadastrarMoto(Scanner scan) {
		Moto moto = new Moto();
		
		scan.nextLine();
		
		System.out.print("\nDigite a placa da moto: ");
		moto.setPlaca(scan.nextLine());
		
		System.out.print("\nDigite a marca da moto: ");
		moto.setMarca(scan.nextLine());
		
		System.out.print("\nEla é cilindrada? (1- Sim / 0- Não): ");
		int cilindrada = scan.nextInt();
		
		if(cilindrada == 1) {
			moto.setCilindrada(true);
		}else {
			moto.setCilindrada(false);
		}
		
		return moto;
	}
	
}
