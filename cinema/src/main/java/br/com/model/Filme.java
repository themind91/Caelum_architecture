package br.com.model;

import java.time.Duration;

public class Filme {
	
	private String nome;
	private Duration duracao;
	
	
	public Filme(String nome, Duration duracao) {
		this.nome = nome;
		this.duracao = duracao;
	}


	public String getNome() {
		return nome;
	}

	public Duration getDuracao() {
		return duracao;
	}
}
