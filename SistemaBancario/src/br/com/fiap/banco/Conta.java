package br.com.fiap.banco;

/*
 * Classe que abstrai uma conta bancária
 * @author Eduardo Lima
 * @version 1.0
 * */
public class Conta {

	int agencia;
	int numero;
	double saldo;
	
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
	
	public double verificarSaldo() {
		return this.saldo;
	}
}