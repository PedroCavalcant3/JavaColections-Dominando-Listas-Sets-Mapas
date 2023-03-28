package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {
	
	private int tempoTotal = 0;
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();// list é uma interface, ela tem os mesmos metodos do arraylist, sempre usar list, conseeguimos encapsular e esconder quem esta dentro da list, toda vez que eu criar um curso eu ja vou ter um espaço que armazena aquelas aulas do curso
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>(); 
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public String getNome() {
		return this.nome;
	}
	public String getInstrutor() {
		return this.instrutor;
	}
	
	public List<Aula> getAulas(){
		/* programar defensivalente, tornar a lista não modificavel por ninguem, passamos nosso lista para o metodo e ele retorna uma read only*/
		return Collections.unmodifiableList(aulas); 
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Curso: "+this.getNome() + " tempo total: " + getTempoTotal() + ", " + "aulas: " + "[" +this.getAulas() + "]";
	}
	
	public void matricula(Aluno aluno){
	    this.alunos.add(aluno);
	    this.matriculaParaAluno.put(aluno.getnumeroMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos(){
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
		
	}

	public Aluno buscaMatriculado(int matricula) {
		
		return this.matriculaParaAluno.get(matricula);
	}
	
	
	
	
	
	

	
	
}
