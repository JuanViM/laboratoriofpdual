package ejercicios;

import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {
	 System.out.println("Intrporuzca una frase");
	 Scanner fr = new Scanner(System.in);
	 String frase = fr.nextLine();
	// System.out.println(contiene(frase));
	System.out.println(frase.startsWith("programa")); 
	}

	

}