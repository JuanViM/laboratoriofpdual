package ejercicios;

import java.util.Scanner;

public class ejercicio7prueba {

	
		public static void main(String[] args) {

			System.out.println("Introduce una frase ");
			Scanner fr = new Scanner(System.in);
			String frase = fr.nextLine();
			System.out.println(cuentaVocales(frase));

		}

		
		public static String cuentaVocales(String frase) {
			int contador=0;
			String oracion=frase.toLowerCase();
			for(int i=0;i<oracion.length();i++) 
				if(oracion.charAt(i) >= '0' && oracion.charAt(i) <= '9') {
					return "La frase no tiene solo letras, por favor introduzca letras unicamente";
				}else {
					
						if(frase.toLowerCase().charAt(i) == 'a' || frase.toLowerCase().charAt(i) == 'e' || frase.toLowerCase().charAt(i) == 'i' || frase.toLowerCase().charAt(i) == 'o' || frase.toLowerCase().charAt(i) == 'u') {
							contador++;	
						}
					
						
					
					
					}
					
				
			return "La frase contiene "+contador+ " de vocales.";
			}
		}
	
