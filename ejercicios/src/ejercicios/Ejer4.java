package ejercicios;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {

		System.out.println("Introduzca una frase");
		Scanner fr = new Scanner(System.in);
		String frase = fr.nextLine();

		System.out.println("La frase introducida es: " + frase);

		System.out.println("Los numeros encontrados han sido " +imprimenumeros(frase));
	}

	public static String imprimenumeros(String frase) {

		String numeros = "";
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) >= '0' && frase.charAt(i) <= '9') {
				numeros = numeros + " " + frase.charAt(i);
		}else {
	
	}
		
	}
		return  numeros;
}
}
