package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleçoes do Java", "Paulo Silveira"); // criando Curso

		/*
		 * criando referencia onde armazenará as aulas, .getAulas() devolve uma lista
		 * read only, nao é possivel mais adicionar uma aula deste modo
		 * javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList",21));
		 * List<Aula> aulas = javaColecoes.getAulas();
		 */

		/* Criação do metodo Adiciona, adicionar aula corretamente */

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 21));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 21));
		javaColecoes.adiciona(new Aula("Modelando dados", 25));

		System.out.println(javaColecoes.getAulas());

		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		System.out.println(javaColecoes);
		


	}
}
