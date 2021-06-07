package Complementario6;
import java.util.*;

public class Complementario6 {
    public static int c;
    
    public static void main(String[] args) {
        Set<Empleado> lista = new HashSet<Empleado>();

        //formato carga por variable
        String nombre = "Homero";
        int dni = 30520640;
        int horas = 50;
        int valorxH = 400;

        Empleado registro1 = new Empleado(nombre, dni, horas, valorxH);
        //formato carga por parametros directo
        Empleado registro2 = new Empleado("Carlos", 25789323, 25, 550);
        Empleado registro3 = new Empleado("Leo", 40570846, 20, 700);

        lista.add(registro1);
        lista.add(registro2);
        lista.add(registro3);

        System.out.println("Lista de empleados:");
        System.out.println("--------------------");
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
        
        System.out.println();

        System.out.println("   DNI      Sueldo");
        System.out.println("----------------------");
        System.out.println(" "+ registro1.obtDni() + "   " + registro1.sueldo());  
        System.out.println(" "+ registro2.obtDni() + "   " + registro2.sueldo());
        System.out.println(" "+ registro3.obtDni() + "   " + registro3.sueldo());
    }    
}