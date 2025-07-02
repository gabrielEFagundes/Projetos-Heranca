package com.petshop.view;

import com.petshop.model.*;
import com.petshop.services.Gerenciamento;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
	
	Scanner scan = new Scanner(System.in);
	
	public final String COR_SUCESSO = "\033[1;32m";
	public final String RESET_COR = "\033[0m";
	
	public int interfaceInicial() {
		System.out.print("\n+====--< PET-SHOP DOGWASH >--====+"
						 + "\n| 1- Cadastrar Pet               |"
						 + "\n| 2- Visualizar os Pets          |"
						 + "\n| 3- Editar Pet                  |"
						 + "\n| 4- Excluir um Pet              |"
						 + "\n| 5- Reiniciar o sistema         |"
						 + "\n| 0- Sair                        |"
						 + "\n+--------------------------------+"
						 + "\n  Sua escolha -> ");
		
		int escolha = scan.nextInt();
		
		return escolha;
	}
	
	public int escolhaCadastro() {
		System.out.print("\n+-- Qual categoria você deseja cadastrar? --+"
					   + "\n| 1- Dono                                   |"
					   + "\n| 2- Veterinário                            |"
					   + "\n+-------------------------------------------+"
					   + "\n  Sua escolha: ");
		
		int cadastrar = scan.nextInt();
		
		return cadastrar;
	}
	
	public Dono cadastroDono(Dono dono) {
		scan.nextLine();
		
		System.out.print("\nDigite o nome do dono: ");
		dono.setNome(scan.nextLine());
		
		System.out.print("\nDigite o telefone do dono: ");
		dono.setTelefone(scan.nextLine());
		
		System.out.print("\nDigite o nome do pet do dono: ");
		dono.setNomePet(scan.nextLine());
		
		return dono;
	}
	
	public Veterinario cadastrarVet(Veterinario veterinario) {
		scan.nextLine();
		
		System.out.print("\nDigite o nome do veterinário: ");
		veterinario.setNome(scan.nextLine());
		
		System.out.print("\nDigite o telefone do veterinário: ");
		veterinario.setTelefone(scan.nextLine());
		
		System.out.print("\nDigite o registro profissional do veterinário: ");
		veterinario.setRegistroProfissional(scan.nextLine());
		
		return veterinario;
	}
	
	public int mostrarEscolha() {
		System.out.print("\n+--- Quem você deseja visualizar? ---+"
					   + "\n| 1- Donos                           |"
					   + "\n| 2- Veterinários                    |"
					   + "\n+------------------------------------+"
					   + "\nSua escolha: ");
		
		int escolha = scan.nextInt();
		return escolha;
	}
	
	// TODO: Mudar o input de retorno para que ele aceite qualquer tecla além de 0
	public int mostrarDonos(Dono dono, List<Dono> donos) {
		int cont = 1;
		
		System.out.println("\n\tNome\t\tTelefone\t\tNome do Pet");
		for(Dono i : donos) {
			System.out.printf("%d-\t%s\t\t%s\t\t\t%s\n", cont, i.getNome(), i.getTelefone(), i.getNomePet());
			cont++;
		}
		System.out.println();
		System.out.println("Digite 0 para voltar.");
		int voltar = scan.nextInt();
		
		return voltar;
	}
	
	public int mostrarVets(Veterinario veterinario, List<Veterinario> vets) {
		int cont = 1;
		
		System.out.println("\n\tNome\t\tTelefone\t\tRegistro");
		for(Veterinario i : vets) {
			System.out.printf("%d- \t%s\t\t%s\t\t%s\n", cont, i.getNome(), i.getTelefone(), i.getRegistroProfissional());
			cont++;
		}
		System.out.println();
		System.out.println("Digite 0 para voltar.");
		int voltar = scan.nextInt();
		
		return voltar;
	}
	
	// MÉTODOS DE CONFIRMAÇÃO E ESPERA
	public void limpa() {
		for(int i = 0; i < 50; i++) {
			System.out.println("");
		}
	}
	// sim, tive que fazer gambiarra para conseguir simular um system("cls"), tipo em C
	
	public void sucesso() {
		System.out.println(COR_SUCESSO + "\n\nOperação bem-sucedida!" + RESET_COR);
		return;
	}
	
	public void erro() {
		System.err.println("\n\nOperação não pôde ser concluída por um erro desconhecido.");
		return;
	}
	
	public void erroDigito() {
		System.err.println("\n\nOperação não pôde ser concluída pois o digito não existe.");
	}
	
	public void executando() throws InterruptedException{
		String loading[] = new String[23];
		
		System.out.println("\n+----- Cadastrando -----+");
		System.out.print("|");
		for(int i = 0; i < loading.length; i++) {
			Thread.sleep(100);
			loading[i] = "█";
			System.out.print(loading[i]);
		}
		System.out.print("|");
	}

}
