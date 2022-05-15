package br.com.dio.model;

public class Gato {

	private String nome;
	private String raca;
	private Integer idade;
	
	public Gato() {
		// TODO Auto-generated constructor stub
	}
	
	public Gato(String nome, String raca, Integer idade) {
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", raca=" + raca + ", idade=" + idade + "]";
	}


}
