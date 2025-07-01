package com.appclinica.service;

import java.util.Scanner;

import com.appclinica.model.Medico;
import com.appclinica.model.Paciente;

public class CadastroService {
	
	public Paciente cadastrarPaciente(Scanner scan) {
		Paciente paciente = new Paciente();
		
		System.out.print("\nDigite o nome do paciente: ");
		paciente.setNome(scan.nextLine());
		
		System.out.print("\nDigite o telefone do paciente: ");
		paciente.setTelefone(scan.nextLine());
		
		System.out.print("\nDigite o Plano de Saúde do paciente: ");
		paciente.setPlanoSaude(scan.nextLine());
		
		return paciente;
	}
	
	public Medico cadastrarMedico(Scanner scan) {
		Medico medico = new Medico();
		
		System.out.print("\nDigite o nome do médico: ");
		medico.setNome(scan.nextLine());
		
		System.out.print("\nDigite o telefone do médico: ");
		medico.setTelefone(scan.nextLine());
		
		System.out.print("\nDigite a especialidade do médico: ");
		medico.setEspecialidade(scan.nextLine());
		
		return medico;
	}

}
