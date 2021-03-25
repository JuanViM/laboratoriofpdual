package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Ejer2 {

	public static void main(String[] args) {
		ArrayList<String> colores = new ArrayList<String>();
		
		colores.add("Rojo");
		colores.add("Verde");
		colores.add("Azul");
		colores.add("Amarillo");
		
		System.out.println(colores);
		
		for(String e: colores) {
			System.out.println(e);
		}

	}

}
