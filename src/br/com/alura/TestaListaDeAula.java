package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revisitando as ArrayLists", 21);
		Aula a2 = new Aula("Listas de Objetos", 20);
		Aula a3 = new Aula("Relacionamento entre Listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);// retorna referencia ao objeto, alteramos o to string na classe mãe
		
		Collections.sort(aulas);// nao compila, o sort nao sabe separar objetos, implementamos interface Comparable e reescrevemos método compareTo
		
		System.out.println(aulas); 
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo)); // eu quero que voce ordene as aulas, comparando o tempo das aulas
		
		System.out.println(aulas); 
		
		aulas.sort(null);
		
		aulas.sort(Comparator.comparing(Aula::getTempo)); // proprio método sort tem uma vaiavel com entrada que compara deste modo
	
		
		
		
		

	}

}
