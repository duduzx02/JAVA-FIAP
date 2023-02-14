import java.util.Arrays;

public class LengthStartsEnds {

	public static void main(String[] args) {
		String descricao = new String("Maça Gala, a maça mais doce do mercado!");
		
		System.out.println(descricao.length());
		System.out.println(descricao.startsWith("Maça"));
		System.out.println(descricao.endsWith("!"));
		
		System.out.println(descricao.charAt(1));
		System.out.println(descricao.indexOf("G"));
		System.out.println(descricao.indexOf("Gala"));
		System.out.println(descricao.indexOf("a"));
		System.out.println(descricao.lastIndexOf("a"));
		
		System.out.println(descricao.replace("G", "g"));
		System.out.println(descricao.replace("Gala", "Fuji"));
		System.out.println(descricao.replace("a", "A"));
		
		System.out.println(descricao.split(" ").length);
		System.out.println(Arrays.toString(descricao.split(" ")));
		
		System.out.println(descricao.toLowerCase());
		System.out.println(descricao.toUpperCase());
		
		System.out.println(descricao.substring(0, 4));
		System.out.println(descricao.substring(4));

		System.out.println(descricao.substring(descricao.indexOf("Maça"), descricao.indexOf(" ")));
		
		System.out.println(descricao);
		 
		
	}

}
