import java.util.*;

public class Complementario5 {
    public static int aux;
    public static void main(String[] args) {
        System.out.println("Este programa calculara el total a cobrar de los empleados");

        List<Integer> numeros = new ArrayList<>();
        List<Integer> pago = new ArrayList<>();

        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(4);
        numeros.add(5);

        pago.add(350);
        pago.add(345);
        pago.add(550);
        pago.add(600);
        pago.add(320);

        aux = 0;
        System.out.print("[ ");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print( numeros.get(i)*pago.get(i)+" ");
            aux= aux+numeros.get(i)*pago.get(i);
        }
        System.out.println("]");
        System.out.println("Total Final: $" + aux);
    }
}