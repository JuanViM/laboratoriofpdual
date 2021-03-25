package ejercicios;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		System.out.println("¿Es entresemana?");
		Scanner we = new Scanner(System.in);
		boolean semana=we.nextBoolean();
		System.out.println("Estas de vacaciones");
		Scanner vac = new Scanner(System.in);
		boolean vacaciones=vac.nextBoolean();
		
		System.out.println("Entonces  "+dormir(semana,vacaciones)+ " Dormir");
	}
	
	public static boolean dormir(boolean diasemana, boolean vacaciones) {
		boolean dormir;
		if(diasemana && !vacaciones) {
			
			return dormir=false;
		}else {
			return dormir=true;
		}
		
	}

}
