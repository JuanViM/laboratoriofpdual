package ejercicios;

import java.util.Scanner;

public class ejer11 {

	public static void main(String[] args) {
		System.out.println("Introduza una frase");
		Scanner fr = new Scanner(System.in);
		String frase=fr.nextLine();
		System.out.println("La frase es " +sumacarac(frase));

	}

	public static String sumacarac(String ora) {
		for(int i =0;i<ora.length();i++) {
		
				
			}
		ora=ora.charAt(ora.length()-1)+ora + ora.charAt(ora.length()-1);
		return ora;
		
	}
}
