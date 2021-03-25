package ejercicios;

import java.util.Scanner;

public class ejer10 {

	public static void main(String[] args) {
		System.out.println("Introduzca el numero que desea");
		int numero;
		Scanner n = new Scanner(System.in);
		numero =n.nextInt();
		System.out.println(menor200(numero));
	}

	
	public static boolean menor200(int n) {
		if(n-100 <= 10 || n-200 <= 10 ) {
			return true;
		}
		return false;
	}
}
