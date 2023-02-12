package com.fiap.view;

public class CaixaWhile {

	public static void main(String[] args) {
		int qtdProdutos = 5;
		int registro = 0;
		
		while(registro < qtdProdutos) {
			registro++;
			System.out.println("O produto número " + registro + " foi registrado");
		}
	}
}
