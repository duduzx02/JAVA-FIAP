
public class TiposDedados2 {

	public static void main(String[] args) {
		int x = 10; 	// Declaração de uma variável do tipo int
		double d = x;	// Variável double recebe um tipo int
		long l = x; 	// variável long recebe um tipo int
		float f = x;	// variável float recebe um tipo int (atenção)
		short s = 20; 	// delaração de uma variáveç do tipo short
		x = s; 			// Variável int recebe um tipo short.
		
		double valorDouble = 9.99;
		int valorInt = (int) valorDouble; //casting forçar a conversão com perdas de dados.
		System.out.println(valorInt);

	}

}
