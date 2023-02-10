package com.java.fluxo;

public class FluxoControle {

	public static void main(String[] args) {
		int idade = 100; 

		if (idade >= 18 && idade < 70) {
			System.out.println("É maior de idade!");
		} else if(idade >= 70){
			System.out.println("É Terceira idade!");
			if(idade >= 100) {
				System.out.println("Centenária!");
			}
		}else {
			System.out.println("É menor de idade!");
		}
	} 

}
