package br.com.builder;

import java.time.LocalTime;

public class LocalTimeBuilder {

	private int horas;
	private int minutos;


	private LocalTimeBuilder(int horas, int minutos) {
		this.horas = horas;
		this.minutos = minutos;
		
	}


	public static MinutosPart horas(int i) {
		// TODO Auto-generated method stub
		return new MinutosPart(i);
	}
	

public static class MinutosPart{
	private int horas;
	public MinutosPart(int horas) {
		this.horas = horas;
		// TODO Auto-generated constructor stub
	}
	public LocalTimeBuilder eminutos(int minutos) {
		// TODO Auto-generated method stub
		return new LocalTimeBuilder(this.horas,minutos);
	}
}


public LocalTime build() {
	// TODO Auto-generated method stub
	return LocalTime.of(this.horas, this.minutos);
}

}
