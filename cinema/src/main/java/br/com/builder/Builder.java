package br.com.builder;

import java.time.LocalDate;
import java.time.Month;

public class Builder {
	
	private int dia;
	private Month month;
	private int ano;
	
	public Builder(int dia, Month month, int ano) {
		// TODO Auto-generated constructor stub
		this.dia = dia;
		this.month = month;
		this.ano = ano;
	}
	
	public LocalDate build(){
		
		return LocalDate.of(ano, month, dia);
	}

}
