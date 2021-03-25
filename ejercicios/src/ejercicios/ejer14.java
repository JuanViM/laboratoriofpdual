package ejercicios;

import java.util.Scanner;

public class ejer14 {

	public static void main(String[] args) {
		System.out.println("Introduzca la frase a comprobar si es un palindromo");
		Scanner fr = new Scanner(System.in);
		String frase = fr.nextLine();
		
		System.out.println("La frase al reves "+palindromo(frase));
	}

	public static String palindromo(String frase) {
		String oracion1="";
		String oracion2="";
		for(int i=frase.length()-1;i >= 0;i--) {
			if(frase.charAt(i) == ' ') {
				
			}else {
				oracion1=oracion1+frase.toLowerCase().charAt(i);
			}
			
		}
		for(int i=0;i<frase.length();i++) {
			if(frase.charAt(i)== ' ') {
				
			}else {
				oracion2=oracion2+frase.toLowerCase().charAt(i);
			}
			
			
		
		
	}
		if(oracion1.equals(oracion2)) {
			return "es un palindromo";
		}
		return "No es un palindromo";
}
}