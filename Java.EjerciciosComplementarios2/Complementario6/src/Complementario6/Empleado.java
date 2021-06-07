package Complementario6;

public class Empleado {

    String nombre;
    int dni;
    int horas;
    int valorxH;

    public Empleado(String nombre, int dni, int horas, int valorxH){
        this.nombre = nombre;
        this.dni = dni;
        this.horas = horas;
        this.valorxH = valorxH;
    }

    public String toString() {
        return  ("Nombre: "+ this.nombre + String.valueOf(" DNI: "+ this.dni + " Horas Trabajadas: " + this.horas + " Valor: " + this.valorxH));
    }

    public int sueldo(){
        return (this.horas * this.valorxH);
    }

    public int obtDni(){
        return (this.dni);
    }
}