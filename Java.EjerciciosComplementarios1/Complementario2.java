import java.util.*;

public class Complementario2 {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);

		System.out.println("Este programa va a imprimir el resultado de la suma, resta, multiplicación, división y módulo de dos numeros enteros");

		System.out.println("Ingrese el Primer Numero");
		int a = scan.nextInt();
		
		System.out.println("Ingrese el Segundo Numero");
		int b = scan.nextInt();

		int suma = a+b;
		int resta = a-b;
		int multiplicacion = a*b;
		int division = a/b;
		int modulo = a%b;

		System.out.println("Suma:" + suma);
		System.out.println("Resta:" + resta);
		System.out.println("Multiplicacion:" + multiplicacion);
		System.out.println("Division entera:" + division);
		System.out.println("Modulo:" + modulo);
		scan.close();
	}
}