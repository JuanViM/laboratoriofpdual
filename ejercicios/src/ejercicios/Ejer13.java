package ejercicios;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {
		System.out.println("Introduzca la edad del primer participante");
		Scanner age= new Scanner(System.in);
		int edad1=age.nextInt();
		System.out.println("Introduzca la edad del segundo participante");
		int edad2=age.nextInt();
		System.out.println("Introduzca la edad del tercer participante");
		int edad3=age.nextInt();
		System.out.println(edad(edad1,edad2,edad3));
	}

	public static boolean edad(int edad1,int edad2, int edad3) {
		if((edad1 >=13 && edad1 <=19) || (edad2 >=13 && edad2 <=19) || (edad3 >=13 && edad3 <=19)) {
			return true;
		}
		return false;
		
	
}
}
