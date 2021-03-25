package exception;

import java.io.IOException;

public class Ejer4 {

	public static void main(String[] args) {
		
		int numero []=null;
		
		
		try {
			System.out.println(numero[4]);
		}catch(NullPointerException e) {
			System.out.println(e);
		}
	
		

	}

}
