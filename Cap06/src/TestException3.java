
import java.io.*;

public class TestException3 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("c:\\Note.md");
		
		PrintWriter print = new PrintWriter(fw);
		print.println("Maça = 4");
		print.println("Morango = 6,50");
		print.println("Total = 10,50");
		print.close();
		fw.close();
		
		
		
		
	}
}
