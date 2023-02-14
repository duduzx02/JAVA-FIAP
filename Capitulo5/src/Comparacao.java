
public class Comparacao {

	public static void main(String[] args) {

		String nome = new String("Maça");
		String nome2 = new String("maça");
		String nome3 = new String("maça");
		
		System.out.println(nome.equals(nome2));
		System.out.println(nome.equalsIgnoreCase(nome2));
		System.out.println(nome2.equals(nome3));
		
		boolean teste = (nome2 == nome3);
		System.out.println(teste);
		
		String nome4 = "maça";
		String nome5 = "maça";
		
		teste = (nome4 == nome5);
		System.out.println(teste);
		
		

	}

}
