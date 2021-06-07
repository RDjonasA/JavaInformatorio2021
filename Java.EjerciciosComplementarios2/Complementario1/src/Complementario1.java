import java.util.*;

public class Complementario1 {
  public static boolean sal;
  public static int opc;
  
  public static void main(String[] args) {		
        
		Scanner scan = new Scanner(System.in);

		System.out.println("Este programa cargara una lista de Lugares y luego los imprimira por pantalla");
      
       ArrayList<String>Lugares = new ArrayList<String>();
       //Carga del arraylist 
       while (! sal){
            System.out.println("Ingrese un lugar para agregar al ranking:");
            String lugar = scan.next();

            Lugares.add(lugar);
            
            System.out.println("Desea terminar? 1-0");
            scan.nextLine();
            opc = scan.nextInt();
            if (opc==1){
                sal=true;
            } 
        }
        System.out.println(Lugares);
        scan.close();
    }
}