package br.com.builder;

import java.time.LocalTime;

import br.com.model.Filme;
import br.com.model.Sessao;


public class SessaoBuilder {

	private Filme filme;
	private LocalTime horarioInicial;

	private SessaoBuilder(Filme filme, LocalTime horarioInicial) {
		this.filme = filme;
		this.horarioInicial = horarioInicial;
	}

	public static HorarioParte novaSessaoparaOFilme(Filme filme) {
		return new HorarioParte(filme);
	}
	
	public static class HorarioParte  {
		
		private Filme filme;
		private LocalTime horarioInicial;

		public HorarioParte(Filme filme) {
			this.filme = filme;
		}

		public SessaoBuilder as(LocalTime horarioInicial) {
			this.horarioInicial = horarioInicial;
			return new SessaoBuilder(filme, this.horarioInicial);
		}

		public SessaoBuilder as(LocalTimeBuilder horarioBuilder) {
			// TODO Auto-generated method stub
			 return new SessaoBuilder(filme, horarioBuilder.build());
		}
	}

	public Sessao build() {
		return new Sessao(filme, horarioInicial);
	}
}
