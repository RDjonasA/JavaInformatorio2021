import java.util.*;

public class Complementario4 {
    public static void main(String[] args) {		
      Scanner scan = new Scanner(System.in);
  
      System.out.println("Este programa hara el factorial de un numero ingresado.");
      
      System.out.println("Ingrese un numero entero:");
      
      int numero = scan.nextInt();
      System.out.println("El factorial de " + numero + " es: " + factorial(numero));
      scan.close();
    }
    
    public static int factorial (int numero) {
        if (numero==0)
          return 1;
        else
          return numero * factorial(numero-1);
    }
}
