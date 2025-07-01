package com.appclinica;

import java.util.Scanner;

import com.appclinica.model.Medico;
import com.appclinica.model.Paciente;
import com.appclinica.service.CadastroService;

public class App {
	
	public static void main(String [] args) {
		
		CadastroService cadastro = new CadastroService();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n+====== CADASTRO PACIENTE ======+");
		Paciente paciente = cadastro.cadastrarPaciente(scan);
		
		System.out.println("\n\n+====== CADASTRO MÉDICO ======+");
		Medico medico = cadastro.cadastrarMedico(scan);
		
		System.out.println("\n\n+====== DADOS CADASTRADOS ======+\n");
		medico.mostrarMedico();
		System.out.println();
		paciente.mostrarPaciente();
		
	}

}
