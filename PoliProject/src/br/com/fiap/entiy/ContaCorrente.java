package br.com.fiap.entiy;


public class ContaCorrente {

	protected double saldo;
	public static final int BANCO = 33;
	
	public void sacar(double valor) throws SaldoInsuficienteException{
		if (valor > saldo) {
			throw new SaldoInsuficienteException();
		}
		
		saldo -= valor;
	}

}
