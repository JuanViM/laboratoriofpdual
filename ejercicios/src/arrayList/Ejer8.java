package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Ejer8 {

	public static void main(String[] args) {
	
		ArrayList<String> orden = new ArrayList<String>();
		
		orden.add("Rojo");
		orden.add("Verde");
		orden.add("Violeta");
		orden.add("Azul");
		
		System.out.println(orden);
		Collections.sort(orden);
		System.out.println(orden);

	}

}
