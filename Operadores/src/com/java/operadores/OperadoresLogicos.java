package com.java.operadores;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int idade = 20;
		boolean precisaVotar = idade >= 18 && idade < 70;
		
		System.out.println(precisaVotar);
		
		int nrAmarelo = 1, nrVermelhor = 0;
		
		boolean suspenso = nrAmarelo == 2 || nrVermelhor == 1;
		System.out.println(suspenso);

		
		int x = 12, y = 11;
		
		boolean teste = x > 10 ^ y > 10;
		
		System.out.println(teste);
		
		System.out.println(!true);
		System.out.println(!false);
		
	}

}
