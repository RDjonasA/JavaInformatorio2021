import java.util.*;

public class Complementario3 {
  public static int numero;
  
  
  public static void main(String[] args) {		
        
		Scanner scan = new Scanner(System.in);

		System.out.println("Este programa mostrara la baraja francesa de diferentes formas");
      
        ArrayList<Integer> Baraja = new ArrayList<Integer>();
        
        //Carga del baraja en orden
       for(int i =0; i <= 12; i++){
            Baraja.add((i+2));
       }
       
       System.out.println("Baraja en orden: "+ Baraja);
       
       //bloque reverso
       Collections.reverse(Baraja);
       System.out.println("Baraja en reverso: "+ Baraja);
              
        //bloque mezcla
        Collections.shuffle(Baraja);
        System.out.println("Baraja mezclada: "+ Baraja);

        scan.close();
    }    
}
/*Otra forma de hacer reverse
ListIterator iter = Baraja.listIterator(Baraja.size());
numero = 0;
System.out.print("Baraja en reverso: [");
       
while (iter.hasPrevious()){
    if (numero!=12){
        System.out.print(iter.previous()+", ");
    }else{
        System.out.print(iter.previous());
    }
        numero++;
}
System.out.print("]");*/