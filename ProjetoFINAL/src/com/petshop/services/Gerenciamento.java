package com.petshop.services;

import com.petshop.model.*;
import com.petshop.view.Interface;

import java.util.List;
import java.util.ArrayList;

public class Gerenciamento {
	
	List<Dono> donos = new ArrayList<>();
	List<Veterinario> vets = new ArrayList<>();
	
	boolean encontrado = false;
	
	public void gerenciamentoPetshop(int escolha, Interface visual, Dono dono, Veterinario vet) throws InterruptedException {
		
		switch(escolha) {
		case 1 -> {
				int escolhaCadastro = visual.escolhaCadastro();
				
				if(escolhaCadastro == 1) {
					dono = visual.cadastroDono(dono);
					cadastrarDono(dono, visual);
					
				}else if(escolhaCadastro == 2) {
					vet = visual.cadastrarVet(vet);
					cadastrarVet(vet, visual);
					
				}else {
					visual.erroDigito();
				}
				
				Thread.sleep(2000);
				System.out.flush();
				visual.limpa();
			}
		case 2 -> {
				int escolhaVer = visual.mostrarEscolha();
				
				if(escolhaVer == 1) {
					String temp = visual.mostrarDonos(dono, donos);
					
					Thread.sleep(500);
					System.out.flush();
					visual.limpa();
					
				}else if(escolhaVer == 2) {
					String temp = visual.mostrarVets(vet, vets);
					
					Thread.sleep(500);
					System.out.flush();
					visual.limpa();
					
				}
			}
		case 3 -> { // edição
				
			}
		case 4 -> { // deletação
				
			}
		case 5 -> { // reinicialização
				
			}
		case 0 -> { // saída
				
			}
		}
	}
	
	public void cadastrarDono(Dono dono, Interface visual) throws InterruptedException {
		String nomeDono = dono.getNome();
		String telDono = dono.getTelefone();
		String petDono = dono.getNomePet();
		
		dono = new Dono(nomeDono, telDono, petDono);
		
		donos.add(dono);
		
		Thread.sleep(1000);
		visual.executando();
		Thread.sleep(1000);
		
		for(Dono i : donos) {
			if(i.getNome().equalsIgnoreCase(nomeDono)) {
				encontrado = true;
				visual.sucesso();
				break;
			}	
		}
		
		if(!encontrado) {
			visual.erro();
		}
	}
	
	public void cadastrarVet(Veterinario veterinario, Interface visual) throws InterruptedException {
		String nomeVet = veterinario.getNome();
		String telVet = veterinario.getTelefone();
		String registroVet = veterinario.getRegistroProfissional();
		
		veterinario = new Veterinario(nomeVet, telVet, registroVet);
		
		vets.add(veterinario);
		
		Thread.sleep(1000);
		visual.executando();
		Thread.sleep(1000);
		
		for(Veterinario i : vets) {
			if(i.getNome().equalsIgnoreCase(nomeVet)) {
				encontrado = true;
				visual.sucesso();
				break;
			}
		}
		
		if(!encontrado) {
			visual.erro();
		}
	}
}
