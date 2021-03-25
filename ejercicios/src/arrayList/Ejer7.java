package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		ArrayList<String> colores = new ArrayList<String>();
		System.out.println("¿que color busca?");
		Scanner c = new Scanner(System.in);
		String color = c.nextLine();

		colores.add("rojo");
		colores.add("Verde");
		colores.add("Mandarina");
		
		System.out.println(busqueda(colores,color));
		
	}

	public static String busqueda(List<String> colores,String color) {

		
		for (int i = 0; i < colores.size(); i++)
			if (colores.get(i).toLowerCase().contains(color.toLowerCase())) {

				return "La palabra que busca se encontro y es " + colores.get(i);
			}
		return "No se encontro el color";

	}
}
