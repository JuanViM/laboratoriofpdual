package ejercicios;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		
	System.out.println("Introduce el primer lado del triangulo");
	Scanner tr = new Scanner(System.in);
	float sidea = tr.nextInt();
	System.out.println("Introduce el segundo lado del triangulo");
	float sideb = tr.nextInt();
	System.out.println("Introduce el tercero lado del triangulo");
	float sidec = tr.nextInt();
	
	System.out.println(dimeTriangulo(sidea,sideb,sidec));
	
	}

	
	public static String dimeTriangulo (float numero1, float numero2, float numero3){
		if (numero1 == numero2 && numero2==numero3 && numero3 == numero1) {
			return " Este triangulo es equilatero";
			
		   }else if(numero1 == numero2 || numero2==numero3 || numero3==numero1) {
			   return "Este triangulo es Isosceles" ;
		   }else {
			   return "Este triangulo es escaleno";
		   }
		
		
	}
}
