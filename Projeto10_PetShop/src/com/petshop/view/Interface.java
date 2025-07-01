package com.petshop.view;

import java.util.Scanner;

public class Interface {
	
	Scanner scan = new Scanner(System.in);
	
	public void interfaceInicial() {
		System.out.print("\n+====--< PET-SHOP DOGWASH >--====+"
						 + "\n| 1- Cadastrar Pet               |"
						 + "\n| 2- Editar Pet                  |"
						 + "\n| 3- Visualizar os Pets          |"
						 + "\n| 4- Excluir um Pet              |"
						 + "\n| 5- Reiniciar o sistema         |"
						 + "\n| 0- Sair                        |"
						 + "\n+--------------------------------+"
						 + "\n  Sua escolha -> ");
	}

}
