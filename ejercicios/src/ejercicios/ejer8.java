package ejercicios;

import java.util.Scanner;

public class ejer8 {

	public static void main(String[] args) {
		System.out.println("Introduzca el numero que desea");
		Scanner num = new Scanner(System.in);
		int numero = num.nextInt();
		System.out.println(calcular(numero));
	}

	public static int calcular(int b) {
		
		if(b>21) {
			b=b-21;
		}else {
			b=(21-b)*2;
		}
		return b;
	}
}