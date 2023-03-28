package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {

		Collection<Integer> numeros = new ArrayList<Integer>();
		
		long inicio = System.currentTimeMillis();

		for (int i = 1; i <= 50000; i++) {
			numeros.add(i);
		}

		long fim = System.currentTimeMillis();
		
		long tempoDeExecucao = fim - inicio;
		
		System.out.println("Tempo gasto1: " + tempoDeExecucao);
		
		long inicio2 = System.currentTimeMillis();
		
		for (Integer numero : numeros) {
			numeros.contains(numero);
		}

		long fim2 = System.currentTimeMillis();
		
		long tempoDeExecucao2 = fim2 - inicio2;
		
		System.out.println("Tempo gasto2: " + tempoDeExecucao2);
		
		

	}

}
