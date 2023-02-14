import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class TesteArquivo {

	public static void main(String[] args) {
		String nomeDoArquivo = "estoque.txt";
		String diretorio = System.getProperty("User.home");
		String caminho = diretorio + "\\" + nomeDoArquivo;
		
		List<String> conteudo = new ArrayList<>();
		
		conteudo.add("Produto; Quantidade; Unidade de Medida; Valor da Unidade");
		conteudo.add("Pera; 200; pct; 5,40");
		conteudo.add("Morango; 400; cx; 6,50");
		conteudo.add("Abacaxi; 280; un; 5,00");
		
//		GravarEstoque(nomeDoArquivo, caminho, conteudo);
		lerEstoque(caminho);
 		

	}

	private static void lerEstoque(String caminho) {
		try {
			// Abre o arquivo
			FileReader stream = new FileReader(caminho);
			
			// BufferedReader possui o método readLine();
			// lê uma linha do arquivo e retorna uma String com o valor lido ou null
			BufferedReader reader = new BufferedReader(stream);
			
			// Lê uma linha do arquivo
			String linha = reader.readLine();
			
			// Enquanto linha for diferente de null
			
			while (linha != null) {
				System.out.println(linha);
				// Lê a próxima linha do arquivo
				linha = reader.readLine();
			}
			reader.close();
			stream.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void GravarEstoque(String nomeDoArquivo, String caminho, List<String> conteudo) {
		FileWriter stream;
		PrintWriter print;
		
		try {
			// stream é uma conexão de escrita para o arquivo
			stream = new FileWriter(caminho);
			// a classe PrintWriter escreverá no arquivo
			print = new PrintWriter(stream);
			
			for(String linha: conteudo) {
				// o método println escreve uma linha no arquivo
				print.println(linha);
			}
			
			//close fecha o arquivo
			print.close();
			stream.close();
			
			System.out.println("O arquivo " + nomeDoArquivo + " foi salvo em " + caminho);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
