package br.com.fiap.banco;

public class TesteConta {
	
	public static void main(String[] args) {
		
		Conta cc = new Conta();
		cc.setAgencia(123);
		cc.setNumero(321);
		cc.depositar(50.0);
		
		cc.depositar(50);
		cc.depositar(50);
		
		System.out.println(cc.getSaldo());
		
		Conta poupanca = new Conta(123, 222, 100);
		
		poupanca.sacar(50);
		
		System.out.println(poupanca.getSaldo());
		
	}
}