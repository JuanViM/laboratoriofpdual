package ejercicios;

import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		
		System.out.println("Introduzca su nombre por favor");
		Scanner name = new Scanner(System.in);
		String nombre = name.nextLine();
		
		if(numero(nombre)) {
			System.out.println("hola " + nombre);
		}else {
			System.out.println("no debe introducir numeros");
		}
		
		
	}

	public static boolean numero(String nombre) {
		
		for (int i = 0; i < nombre.length(); i++) {
			if (nombre.charAt(i) < 'A' || nombre.charAt(i) > 'z')
				return false;

		}
				return true;

	}

}
