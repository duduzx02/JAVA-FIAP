package br.com.fiap.entiy;

public class TestCC {
	
	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrenteEspecial();
		
		try {
			conta.sacar(20);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
	}
}
