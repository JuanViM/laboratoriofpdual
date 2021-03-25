package exception;

public class Ejer9 {

	public static void main(String[] args) {
		int celda=0;
		int [] numero = {1,2,3,4,5,6,7};
		while(true) {
		try {
			System.out.println("el numero "+celda + " del array es " +numero[celda]);
			celda++;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("El array es mas grande de "+celda);
			break;
		}
		

	}

}
}
