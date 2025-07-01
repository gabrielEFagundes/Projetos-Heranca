package com.petshop;

import com.petshop.model.*;
import com.petshop.services.Gerenciamento;
import com.petshop.view.Interface;

public class App {
	
	public static void main(String [] args) throws InterruptedException {
		
		Dono dono = new Dono();
		Veterinario veterinario = new Veterinario();
		Gerenciamento gerenciamento = new Gerenciamento();
		Interface visual = new Interface();
		
		while(true) {
			
			int escolha = visual.interfaceInicial();
			
			gerenciamento.gerenciamentoPetshop(escolha, visual, dono, veterinario);
			
		}
		
	}

}
