import java.util.*;

public class Complementario2 {
  public static int numero;
  
  public static void main(String[] args) {		
        
		Scanner scan = new Scanner(System.in);

		System.out.println("Este programa cargara una lista en el primer lugar y el ultimo, luego imprime por pantalla las dos listas y el tamaño");
      
        ArrayList<Integer> Lista1 = new ArrayList<>();
        ArrayList<Integer> Lista2 = new ArrayList<>();
       //Carga del arraylist1
       System.out.println("Por favor, ingrese los elementos");
       for(int i =0; i <= 4; i++){
        System.out.print("Elemento " + (i+1) + ": "); Lista1.add(scan.nextInt());
       }

       //como no entendi bien el enunciado si queria que itere que se pueda ingresar varias veces al inicio y al final o que se ingrese una sola vez
       //lo deje como si se ingresara una sola vez no mas, en caso de querer ingresar varias veces al inicio y al final se tendria que cambiar esta parte
       
       //bloque de carga al inicio
       System.out.println("Ingrese el elemento a colocar al inicio: "); 
       Lista2.add(scan.nextInt());

       for(int j =0; j <= 4; j++){
            Lista2.add(Lista1.get(j));
       }
       
       //bloque de carga al final
       System.out.println("Ingrese el elemento a colocar al final: "); 
       Lista2.add(scan.nextInt());

       System.out.println("Lista 1: "+ Lista1 + " - Size: " + Lista1.size());
       System.out.println("Lista 2: "+ Lista2 + " - Size: " + Lista2.size());
       
       /*otra forma de hacer la impresion por pantalla:
       System.out.print("Lista 1: ");
       for(int i =0; i <= 4; i++){
           System.out.print(Lista1.get(i)+ ", ");
       }
       System.out.println("Size: "+ Lista1.size());
       
       System.out.print("Lista 2: ");
       for(int j =0; j <= 6; j++){
           System.out.print(Lista2.get(j)+ ", ");
       }
       System.out.println("1Size: "+ Lista2.size());
       */
        scan.close();
    }
}