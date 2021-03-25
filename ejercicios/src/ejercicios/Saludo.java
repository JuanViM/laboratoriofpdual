package ejercicios;

import java.util.Scanner;

public class Saludo {

	public static void main(String[] args) {
		String frase="hola";
		System.out.println("Introduzca una palabra");
		Scanner fr = new Scanner(System.in);
		String oracion = fr.nextLine();
		System.out.println(frase+" "+oracion);

	}

}
