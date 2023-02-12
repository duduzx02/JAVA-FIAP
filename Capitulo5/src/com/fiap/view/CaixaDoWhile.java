package com.fiap.view;

public class CaixaDoWhile {

	public static void main(String[] args) {
		int qtdProdutos = 5;
		int registro = 0;
		
		do {
			registro++;
			System.out.println("O caixa registrou o produto " + registro);
		} while (registro < qtdProdutos);
	}
}
