package com.fiap.view;

import com.fiap.entity.Produto;

public class CaixaArray {

	public static void main(String[] args) {
		
//		float[] valores = new float[5];
		
//		valores[0] = 10;
//		valores[1] = 20;
//		valores[2] = 30;
//		valores[3] = 40;
//		valores[4] = 50;
		
//		System.out.println(valores[1]);
		
//		float[]	valores = {10, 20, 30, 40, 50};
//		System.out.println(valores[0]);
		
//		float[] valores2 = new float[] {10, 20, 30, 40, 50};
//		System.out.println(valores2[4]);
		
		
		
		Produto[] produtos = new Produto[2];
		
		Produto prod1 = new Produto();
		prod1.setNome("Limão");
		prod1.setDescricao("Galedo");
		prod1.setValor(4);
		
		Produto prod2 = new Produto();
		prod2.setNome("Maçã");
		prod2.setDescricao("Gala");
		prod2.setValor(5);
		
		produtos[0]	= prod1;
		produtos[1] = prod2;
		
//		for(int i = 0; i < produtos.length; i++) {
//			System.out.println(produtos[i].toString());
//		}
		
		
//		for(Produto prod: produtos) {
//			System.out.println(prod.toString());
//		}

		
		Produto[][] localizacaoProduto = new Produto[10][3];
		
		localizacaoProduto[0][1] = prod1;
		localizacaoProduto[1][2] = prod2;
		
		System.out.println(localizacaoProduto[1][2].getNome());
		
	}

}
