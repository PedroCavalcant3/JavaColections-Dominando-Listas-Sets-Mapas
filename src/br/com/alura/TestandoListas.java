package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {

		String curso1 = "Java Polimorfismo";
		String curso2 = "Java Excessões";
		String curso3 = "Java Colections";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(curso1);
		aulas.add(curso2);
		aulas.add(curso3);

		System.out.println(aulas);

		aulas.remove(0);

		System.out.println(aulas);

		for (String aula : aulas) {// para cada aula dentro de aulas faça o seguinte
			System.out.println("Aula: " + aula);
		}

		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é: " + primeiraAula);

		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("aula: " + aulas.get(i));
		}

		System.out.println("O tamanho da arrayList é: "+aulas.size());

		aulas.forEach(aula -> {
			System.out.println("Percorrendo: ");
			System.out.println("Aula: " + aula);
		});
		
		aulas.add("Aumentando nosso conhecimento");
		
		Collections.sort(aulas);
		
		System.out.println("Depois de ordenado:" + aulas);
	}

}
