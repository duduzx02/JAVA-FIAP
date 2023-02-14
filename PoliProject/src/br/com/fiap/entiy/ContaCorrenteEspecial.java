package br.com.fiap.entiy;


public class ContaCorrenteEspecial  extends ContaCorrente{
	
	private double limite;
	
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException{
		if (valor > saldo + limite) {
			throw new SaldoInsuficienteException();
		}
		
		saldo = saldo - valor;
	}

}
