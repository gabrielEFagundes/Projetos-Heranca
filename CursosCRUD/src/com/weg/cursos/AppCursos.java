package com.weg.cursos;
import com.weg.cursos.view.View;
import com.weg.cursos.services.Services;

public class AppCursos {
	
	public static void main(String [] args) {
		
		View view = new View();
		Services services = new Services();
		
		boolean programa = true;
		
		do {
			
			int escolhaMenu = view.mainMenu();
			
			services.gerenciarCursos(escolhaMenu, view);
			
		}while(programa);
		
	}
	
	// terminar...

}
