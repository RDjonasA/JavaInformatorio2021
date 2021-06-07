import java.util.*;

public class Complementario7 {
  private static char minus[] = {' ','a','b','c','d','e','f','g','h','i','j','k','l','m','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
  private static char mayus[] = {' ','A','B','C','D','E','F','G','H','I','J','K','L','M','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
  private static int longitud;
  private static String aux;  

  public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);

		System.out.println("Este programa convertira un string en minusculas a mayusculas. NO ADMITE SIMBOLOS ESPECIALES");
      
    System.out.println("Ingrese string:");
    String a = scan.nextLine();

    longitud = a.length(); //nombre_string.length(); devuelve longitud del string
    System.out.println(longitud);

    for(int i = 0; i < longitud; i = i +1 ){
      char valor = a.charAt(i); //nombre_string.charAt(entero); devuelve el char de la posicion del numero entero que coloquemos
      System.out.println(valor);
      for(int j = 0; j < 27; j = j +1 ){
        if(minus[j]==valor){ 
          if (aux==null){
            aux = Character.toString(mayus[j])+""; //Character.toString(char); convierte un char en string
          }
          else{
            aux = aux.concat(Character.toString(mayus[j])+""); //nombre_string.concat(string); o nombre_string.concat(char+""); concatena strings
          }
        }
      }
    }
    System.out.println(aux);
    scan.close();
	}
}