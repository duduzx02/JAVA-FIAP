package br.com.fiap.banco;

import java.io.Serializable;

/*
 * Classe que abstrai uma conta bancária
 * @author Eduardo Lima
 * @version 1.0
 * */
public class Conta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int agencia;
	private int numero;
	private double saldo;
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Conta() {
		
	}
	
	/*
	 * Realiza um depóstio na conta corrente
	 * @param agencia o número da agencia
	 * @param agencia o número da conta
	 */

	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}