package exception;

public class Ejer7 {

	public static void main(String[] args) {
		
		
		try {
			String frase="a";
			System.out.println(frase.charAt(2));
			int numero[]= new int [4];
			System.out.println(numero[4]);
		}catch(NullPointerException | ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e){
			System.out.println(e);
		}
		
		
		//
		//
		//
		//
		//

	}

	
}
