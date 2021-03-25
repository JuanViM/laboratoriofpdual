package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Ejer3 {

	public static void main(String[] args) {
		ArrayList<String> colores = new ArrayList<String>();
		
		colores.add("Rojo");
		colores.add("Amarillo");
		colores.add("Verde");
		colores.add("Azul");
		colores.add("Gris");
		colores.add("Negro");
		

		System.out.println(colores);
		
		colores.add(0,"Rosa");
		colores.add(5,"Morado");
		
		System.out.println(colores);
	}

}
