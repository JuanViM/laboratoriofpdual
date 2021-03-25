package exception;

public class ejer8 {

	public static void main(String[] args) {

		int [] numeros = new int [4];
		
		try {
			numeros [4] = 5;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		 

	}

}
