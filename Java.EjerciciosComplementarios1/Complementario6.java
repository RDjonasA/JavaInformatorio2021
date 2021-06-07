import java.util.*;

public class Complementario6 {
  private static int potencia;
  private static int aux;

  public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);

		System.out.println("Este programa hara la potencia de un numero por multiplicaciones sucesivas.");
      
    System.out.println("Ingrese el primer numero entero:");
    int a = scan.nextInt();

    System.out.println("Ingrese el segundo numero entero:");
    int b = scan.nextInt();

    aux = 1;
    for(int i = 1; i <= b; i = i +1 )
    {
      potencia = aux*a;
      aux = potencia;
    }
    System.out.println("El resultado es: "+ potencia);
    scan.close();
	}
}