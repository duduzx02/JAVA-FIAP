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
		
		
		ContaCorrente coc = new ContaCorrente();
		coc.setAgencia(1);
		coc.setNumero(2222);
		coc.setTipo("PF");
		coc.setChequeEspecial(1000);
		
	}
}