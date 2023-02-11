package com.java;

public class Conta {
		
	int numero;
	double saldo;
	int agencia;
	
	Cliente cliente = new Cliente();
	
	public double recuperarSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public void retirar(double valor) {
		saldo = saldo - valor;
	}
	
	public void retirar(double valor, double taxa) {
		saldo = saldo - valor - taxa;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
}
