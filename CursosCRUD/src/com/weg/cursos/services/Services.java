package com.weg.cursos.services;
import com.weg.cursos.view.View;
import com.weg.cursos.model.Curso;

import java.util.List;
import java.util.ArrayList;

public class Services {

	Curso curso = new Curso();
	List<Curso> meusCursos = new ArrayList<>();
	
	public void gerenciarCursos(int escolhaMenu, View view) {
		
		switch(escolhaMenu) {
		case 1 -> {
				cadastrarCurso(view, curso);
			}
		
		case 2 -> {
				int escolhaListagem = view.listarEscolha();
				
				if(escolhaListagem == 1) {
					view.listarTudo(meusCursos);
					
				}else if(escolhaListagem == 2) {
					view.listarPorNome(meusCursos);
					
				}
			}
		
		case 3 -> {
				String nomeCurso = view.removerPorNome(meusCursos);
				
				removerCurso(nomeCurso);
			}
		}
		
	}
	
	public void cadastrarCurso(View view, Curso curso) {
		String nome = view.cadastrarNome();
		int duracao = view.cadastrarDuracao();
		String nivel = view.cadastrarNivel();
		int vagas = view.cadastrarVagas();
		
		curso = new Curso(nome, duracao, nivel, vagas);
		
		meusCursos.add(curso);
	}
	
	public void removerCurso(String nomeCurso) {
		int cont = 0;
		boolean cursoEncontrado = false;
		
		do {
			for(Curso i : meusCursos) {
				if(i.getNome().contains(nomeCurso)) {
					cursoEncontrado = true;
					meusCursos.remove(cont);
					break;
				}
			}
			cont++;
			
		}while(cont < meusCursos.size() || !cursoEncontrado);
	}
	
}
