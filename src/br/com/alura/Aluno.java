package br.com.alura;

import java.util.Objects;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int aluno) {
		if (nome == null) {
			throw new NullPointerException("Nome nao pode ser nulo");
		}

		this.nome = nome;
		this.numeroMatricula = aluno;
	}

	public String getNome() {
		return nome;
	}

	public int getnumeroMatricula() {
		return numeroMatricula;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + "Aluno: " + this.getNome() + ", Matricula: " + this.getnumeroMatricula() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome);
	}

	

}
