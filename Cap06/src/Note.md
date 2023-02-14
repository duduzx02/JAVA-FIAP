#Review

- Durante a execução de um programa é possível que algumas exceções ou erros aconteçam. Os mais comuns são:
	- Falha na aquisição de algum recurso.
	- Tentativa de realizar algo impossível.
	- Condições inválidas
- Em linhas gerais, o fluxo para o tratamento de exceções no java ocorre em três passos? 
	1 - Uma exceção é lançada: um comando do código dispara uma condição inesperada de erro.
	2 - A exceção é capturada: em algum ponto do código, podemos adicionar um comando para capturar a possível exceção.
	3 - O tratamento de erro é realizado: após a captura da exceção, o tratamento de erro adequado é executado.
- Dentro da plataforma java podemos classficar as exceções em:
	- Checked: exceção que deve ser tradada ou relançada pelo desenvolvedor
	- Unchecked: exceção que pode ser tratada ou relançada pelo programador. Se a exceção não for tratada, ela será automaticamente relançada.
	- Error: erro crítico, utilizado pelo JVM para indicar que existe um problema que não permite a execução do programa continuar.
	
## PROPAGAÇÃO DE EXCEÇÕES

- Um método pode opter por não tratar a exceção e simplesmente propagá-la, ou melhor, delefar para o método que a chamou. A cláusula throws declara exceções que podem ser lançadas em determinados métodos.

## CRIAÇÃO DE EXCEÇÕES

- Para criar uma exceção, basta criar uma classe que herde de Exception(checked) ou RuntimeExpception (unchecked).

- Por padrão, as exceções no java termina com Exception.

## ACESSO A ARQUIVOS

- O armazenamento de dados em variáveis, arrays, coleções, ou qualquer outra estrutura de dados em memória, é temporário.

- Os arquivos são muito úteis para armazenar as configurações do programa, ao invés de colocar as configurações diretamente no código fonte. A grande vantagem disso é a possibilidade de alterar o aqruivo de configurações sem a necessidade de recompilar e empacotar todo o programa novamente.

- Todas as entradas e saídas em Java são definidas em termos de fluxos, ou streams. Stream é uma conexão para uma fonte de dados ou um destiono de dados.

As classes para manupular os arquivos ficam dentro do pacote java.io. Duas classes que podemos utilizar para a escrita em arquivo são: java.io.FileWriter e java.io.PrintWriter.
