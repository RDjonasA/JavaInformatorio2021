import java.util.*;

public class Complementario5 {
  private static int multiplicacion;

  public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);

		System.out.println("Este programa hara la multiplicacion de un numero por sumas sucesivas.");
      
    System.out.println("Ingrese el primer numero entero:");
    int a = scan.nextInt();

    System.out.println("Ingrese el segundo numero entero:");
    int b = scan.nextInt();

    for(int i = 1; i <= b; i = i +1 )
    {
      multiplicacion = multiplicacion+a;
    }
    System.out.println("El resultado es: "+ multiplicacion);
    scan.close();
	}
}