package com.java;

public class Conta {
		
	int numero;
	double saldo;
	
	Cliente cliente = new Cliente();
	
	public double recuperarSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
}
