# review

## Não se perdem informações em conversões de um tamanho menor para um maior.
Exemplo, um número inteiro muito grande pode ter mais números que um tipo float pode armazenar.

Por outro lado, existem momentos em que não é possível realizar as conversões automáticas, como tranformar um double em int. Essa conversão é viável, porém há risco em perder informações. Esse tipo de conversão é possível por meio de cast.

## A sintaxe é adicionar o tipo que queremos converter entre parênteses.

	
	double valorDouble = 9.99;
	int valorInt = (int) valorDouble;
	System.out.println(valorInt);
	
	// 9