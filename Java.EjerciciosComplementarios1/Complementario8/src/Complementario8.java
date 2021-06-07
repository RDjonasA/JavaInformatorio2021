import java.util.*;

public class Complementario8 {
  private static char direccion[];
  public static void main(String[] args) {	
    direccion = new char[30];	
		Scanner scan = new Scanner(System.in);

		System.out.println("Este programa pedira datos y los mostrara por pantalla.");

    System.out.println("Ingrese su Nombre y Apellido:");
    String nomyape = scan.nextLine();

    System.out.println("Ingrese su Edad:");
    int edad = scan.nextInt();

    System.out.println("Ingrese su Direccion:");
    String direccion = scan.nextLine() + scan.nextLine();

    System.out.println("Ingrese su Ciudad:");
    String ciudad = scan.nextLine();

    System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + nomyape);
    scan.close();
	}
}