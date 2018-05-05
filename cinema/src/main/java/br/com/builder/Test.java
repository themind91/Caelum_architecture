package br.com.builder;

import java.time.LocalDate;
import java.time.Month;

public class Test {
	
	public static void main(String[] args) {
		LocalDate date= DateBuilder.dia(10).de(5).de(2018).build();
		System.out.println(date);
	}

}
