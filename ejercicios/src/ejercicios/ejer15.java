package ejercicios;

import java.util.Scanner;

public class ejer15 {

	public static void main(String[] args) {

		Scanner nm = new Scanner(System.in);
		System.out.println("Introduzca el primer numero");
		if (!nm.hasNextInt()) {
			System.out.println("El parámetro No. 1 no es numérico");
		} else if (nm.hasNextInt()) {
			int num1 = nm.nextInt();

			System.out.println("Introduzca el segundo numero");
			if (!nm.hasNextInt()) {
				System.out.println("El parámetro No. 2 no es numérico");
			} else if (nm.hasNextInt()) {
				int num2 = nm.nextInt();
				System.out.println("La suma es " + (num1 + num2));
			}

		}

	}
}