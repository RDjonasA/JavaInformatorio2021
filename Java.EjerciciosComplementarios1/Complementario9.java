import java.util.*;

public class Complementario9 {
  public static int cont;
  public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);

		System.out.println("Este programa contara la cantidad de veces que aparece una letra en un string");
      
    System.out.println("Ingrese string:");
    String a = scan.nextLine();
    
    System.out.println("Ingrese la letra a buscar:");
    char b = scan.next().charAt(0);

    int longitud = a.length(); //nombre_string.length(); devuelve longitud del string

    for(int i = 0; i < longitud; i = i +1 ){
      char valor = a.charAt(i);
      if (valor==b){
        cont = cont+1;
      }
    }
    System.out.println(cont);
  }
}