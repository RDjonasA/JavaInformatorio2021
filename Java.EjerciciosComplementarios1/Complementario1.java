import java.util.*;

public class Complementario1 {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);

		System.out.println("Hola, ¿Cual es su nombre?");
		
		String nombre = scan.nextLine();
		System.out.println("HOLA " + nombre + "!!!");
		scan.close();
	}
}