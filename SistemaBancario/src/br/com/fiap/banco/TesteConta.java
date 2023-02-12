package br.com.fiap.banco;

public class TesteConta {
	
	public static void main(String[] args) {
		
		Conta cc = new Conta();
		cc.agencia = 123;
		cc.numero = 321;
		cc.saldo = 50.0;
		
		cc.depositar(50);
		cc.depositar(50);
		
		System.out.println(cc.verificarSaldo());
		
		Conta poupanca = new Conta(123, 222, 100);
		
		poupanca.sacar(50);
		
		System.out.println(poupanca.verificarSaldo());
		
	}
}