package br.com.builder;

import java.time.Month;

public class AnoPart {
	
	private int dia;
	private Month month;
	public AnoPart(int dia,Month month) {
		// TODO Auto-generated constructor stub
		
		this.dia = dia;
		this.month = month;
	}
	

	
	public Builder de(int ano){
		return new Builder(dia,month,ano);
	}

}
