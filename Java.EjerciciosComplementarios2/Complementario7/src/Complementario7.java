import java.util.*;

public class Complementario7 {
    public static int start;
    public static int end;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Este programa agarrara un valor de comienzo y final");

        ArrayList<Integer> Lista = new ArrayList<Integer>();
        ArrayList<String> Lista2 = new ArrayList<String>();
        System.out.println("Nota: El valor de comienzo debe ser menor al valor de final, sino el bucle no finaliza.");
        System.out.println();
        do{
            System.out.print("Ingrese el valor de comienzo: ");
            start = scan.nextInt();
            System.out.print("Ingrese el valor de final: ");
            end = scan.nextInt();
        }while(end<start);

        for (int i = start; i < end; i++) {
            Lista.add(i);
        }
        for (int aux:Lista) {
            if ((((aux % 2) == 0) && ((aux % 3) == 0))) {
                Lista2.add("FizzBuzz");
            }else if ((aux % 2) == 0) {
                Lista2.add("Fizz");
            }else if ((aux % 3 ) == 0) {
                Lista2.add("Buzz");
            }else{
                String cadena = Integer.toString(aux);
                Lista2.add(cadena);
            }
        }
        System.out.print(Lista);
        System.out.println();
        System.out.print(Lista2);
        scan.close();
    }
}