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