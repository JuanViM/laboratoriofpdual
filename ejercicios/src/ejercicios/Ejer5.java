package ejercicios;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
	
		System.out.println("Introduzca la frase que desea");
		Scanner fr = new Scanner(System.in);
		String frase=fr.nextLine();
		
		System.out.println(NumeroPar(frase));
		

	}

	
	public static String NumeroPar(String frase) {
		
		int contador=0;
		for(int i=0;i<frase.length();i++) {
			contador++;
		}
		int vidi=0;
		vidi=contador%2;
		if(vidi == 0) {
			return "el numero de caracteres en la frase " + frase +" es " + contador +" el resto es " + vidi + " por lo tanto es par";
		}
		return " El numero de caracteres en la frase "+ " | " + frase + " | " + " es "  + contador + " el resto es " + vidi + " por lo tanto es impar";
		
		
		
	}
	
	
}
