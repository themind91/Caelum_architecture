package br.com.model;

import java.util.ArrayList;
import java.util.List;

public class Sala {
	
	private String nome;
	private List<Sessao> sessoes;
	
	public Sala(String nome) {
		this.nome = nome;
		this.sessoes = new ArrayList<Sessao>();
	}
	
	public void addSessao(Sessao sessao){
		if (this.verificaSessao(sessao)) {
			this.sessoes.add(sessao);
		}else{
			throw new RuntimeException(" Não foi possível adicionar a sessão ");
		}
	}
	
	private boolean verificaSessao(Sessao sessao){
		return this.sessoes.stream()
			.noneMatch(s ->  s.overlaps(sessao));
	}
	
	public String getNome() {
		return nome;
	}

	public List<Sessao> getSessoes() {
		return sessoes;
	}
	
	

}
