package br.com.fiap.entiy;


public class ContaCorrenteEspecial  extends ContaCorrente implements Transferivel{
	
	private double limite;
	
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException{
		if (valor > saldo + limite) {
			throw new SaldoInsuficienteException();
		}
		
		saldo = saldo - valor;
	}

	@Override
	public boolean realizarDoc(int nrBanco, int nrAgencia, int nrConta, double valor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean realizarTed(int nrBnaco, int nrAgencia, int nrConta, double valor) {
		// TODO Auto-generated method stub
		return false;
	}


	
	
}
