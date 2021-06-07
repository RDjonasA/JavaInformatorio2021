import java.util.*;

public class Complementario3 {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);

		System.out.println("Este programa va incrementar un numero entero las veces que el usuario defina");

		System.out.println("Ingrese un Numero Entero:");
		int a = scan.nextInt();

		for(int i = 1; i <= a; i = i +1 )
		{
			for(int j = 1; j <= i; j = j +1 )
			{
				System.out.print(j);
        	}
			System.out.println();
        }
		scan.close();
	}
}