import java.util.*;

public class Complementario4 {
  public static int numero;
  
  
  public static void main(String[] args) {		
        
		Scanner scan = new Scanner(System.in);

		System.out.println("Este programa cargara 12 alumnos y lo subdivide en 3 sublistas");
      
    ArrayList<String> Alumnos = new ArrayList<String>();

    for (int i = 0; i <12; i++){
      System.out.println("ingrese nombre del alumno: ");
      Alumnos.add(scan.nextLine());
    }

    List<String> Sublista1 = Alumnos.subList(0, 4);
    List<String> Sublista2 = Alumnos.subList(4, 8);
    List<String> Sublista3 = Alumnos.subList(8, 12);

    System.out.println(Sublista1);
    System.out.println(Sublista2);
    System.out.println(Sublista3);
  }
}