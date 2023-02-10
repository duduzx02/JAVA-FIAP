package com.java.leituraDados;

import java.util.Scanner;

public class LeituraDeDados {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite a idade: ");
		idade = sc.nextInt();
		
		
		if (idade <= 0) 
			System.out.println("Idade inválida");
		
		
		if (idade >= 18 && idade < 70) { 
			System.out.println("Maior de idade!");
		} else if (idade >= 70) {
			System.out.println("Terceira Idade!");
			if(idade >=100) {
				System.out.println("Centenário!");
			}
		} else {
			System.out.println("Menor de idade!");
		}
	}

}
