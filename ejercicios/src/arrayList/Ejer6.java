package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Ejer6 {

	public static void main(String[] args) {
		ArrayList<String> colores = new ArrayList<String>();
		
		colores.add("Rojo");
		colores.add("Azul");
		colores.add("Gris");
		colores.add("Rojo");
		colores.add("Verde");
		
		
		System.out.println(colores.size()); // tamaño del arrayList
		System.out.println(colores);
		colores.remove(3);
		System.out.println(colores);
		
	}

	
}
