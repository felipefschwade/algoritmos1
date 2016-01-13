package br.com.alura.algoritmos;

public class Produto {
	
	private double preco;
	private String nome;
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	public double getPreco() {
		return this.preco;
	}
	public String getNome() {
		return this.nome;
	}
	
}
