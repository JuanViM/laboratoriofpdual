package ejercicios;

import java.util.Scanner;

public class Pruebando {

	public static void main(String[] args) {
		Scanner nm = new Scanner(System.in);
		Scanner nm2 = new Scanner(System.in);
		System.out.println("Introduzca el primer numero");
		int numero = nm.nextInt();
		if (!nm.hasNextInt()) {
			
			System.out.println("No es numerico");
		}
		System.out.println("Introduzca el segundo numero");
		int numero2 = nm2.nextInt();
		if (!nm2.hasNextInt()) {
	
			System.out.println("El parámetro No. 2 no es numérico");

		}

		System.out.println(numero+numero2);
	}

}
