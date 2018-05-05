package br.com.model;

import java.time.LocalTime;

public class Sessao {
	
	private Filme filme;
	private LocalTime horarioInicial;
	
	public Sessao(Filme filme, LocalTime horarioInicial) {
		this.filme = filme;
		this.horarioInicial = horarioInicial;
	}

	public Filme getFilme() {
		return filme;
	}

	public LocalTime getHorarioInicial() {
		return horarioInicial;
	}
	
	public LocalTime getHorarioFinal() {
		return this.getHorarioInicial().plus(this.getFilme().getDuracao());
	}

	public boolean overlaps(Sessao sessao){
		return sessao.getHorarioFinal().isBefore(getHorarioInicial()) || 
				getHorarioFinal().isBefore(sessao.getHorarioInicial()); 
	}

}
