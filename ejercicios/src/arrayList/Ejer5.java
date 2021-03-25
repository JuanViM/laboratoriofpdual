package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Ejer5 {

	public static void main(String[] args) {
		
	ArrayList<String> colores = new ArrayList<String>();
	
	colores.add("Rojo");
	colores.add("Verde");
	colores.add("Celeste");
	
	System.out.println(colores);
	
	colores.set(2,"azul");
	System.out.println(colores);
	

	}

}
