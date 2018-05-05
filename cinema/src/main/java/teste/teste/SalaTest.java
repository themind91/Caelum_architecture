package teste.teste;

import java.time.Duration;
import java.time.LocalTime;

import org.junit.Before;
import org.junit.Test;

import br.com.model.Filme;
import br.com.model.Sala;
import br.com.model.Sessao;

public class SalaTest 
{
	@Before
	public void setup() {
		
	}
	
	

	
	@Test(expected=RuntimeException.class)
	public void adicionarNoMesmoHorario(){
		Sala sala = new Sala("eldorado3d");
		Filme filme = new Filme("star wars", Duration.ofHours(1));
		Filme filme2 = new Filme("star 2", Duration.ofHours(1));
		Sessao sessaoFilme2 = new Sessao(filme2, LocalTime.of(10, 0));
		Sessao sessao = new Sessao(filme, LocalTime.of(10,0));

		sala.addSessao(sessao);
		sala.addSessao(sessaoFilme2);

	}
	
	@Test(expected=RuntimeException.class)
	public void adicionarAntesComSobreposicao(){
		Sala sala = new Sala("eldorado3d");
		Filme filme = new Filme("star wars", Duration.ofHours(1));
		Filme filme2 = new Filme("star 2", Duration.ofHours(1));
		Sessao sessaoFilme2 = new Sessao(filme2, LocalTime.of(10, 0));
		Sessao sessao = new Sessao(filme, LocalTime.of(10,5));

		sala.addSessao(sessao);
		sala.addSessao(sessaoFilme2);
		
		
	}
	@Test
	public void adicionarAntesSemSobreposicao(){
		Sala sala = new Sala("eldorado3d");
		Filme filme = new Filme("star wars", Duration.ofHours(1));
		Filme filme2 = new Filme("star 2", Duration.ofHours(1));
		Sessao sessaoFilme2 = new Sessao(filme2, LocalTime.of(10, 0));
		Sessao sessao = new Sessao(filme, LocalTime.of(10,0));

		sala.addSessao(sessao);
		sala.addSessao(sessaoFilme2);
		
		
	}
}
