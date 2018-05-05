package br.com.builder;

import java.time.Month;

public class MesPart {
	
	private int dia;

	public MesPart(int dia) {
		this.dia = dia;
	}
	
	public AnoPart de(Month mes){
		return new AnoPart(dia,mes);
		
	}
	
	public AnoPart de(int mes){
		return new AnoPart(dia, Month.of(mes));
	}

}
