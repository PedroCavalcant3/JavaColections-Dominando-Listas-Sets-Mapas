package br.com.alura;
import java.util.*;

public class TestaAlunos {
	
	    public static void main(String[] args) {

	        Collection<String> alunos = new HashSet<>();
	        alunos.add("Paulo");
	        alunos.add("Alberto");
	        alunos.add("Pedro");    
	        alunos.add("Nico"); 
	        alunos.add("riva");   
	        
	        System.out.println(alunos.size());
	        
	        boolean adicionou = alunos.add("Pedro");
	        System.out.println("Pedro foi adicionado ao Set? " + adicionou);//false
	        
	        System.out.println(alunos.size());
	 
	        for (String aluno : alunos) {
				System.out.println(aluno);
			}
	        
	        

	    }
	}
