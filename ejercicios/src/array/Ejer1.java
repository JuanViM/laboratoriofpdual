package array;

public class Ejer1 {

	public static void main(String[] args) {
		
		int numeros[] = {2,2,2,2,2,6};
		
		System.out.println(numero(numeros));
	}

	public static boolean numero(int [] numeros) {
		
		if(numeros[0] == 6 || numeros[numeros.length-1] == 6){
			return true;
		}
		return false;
	}
}
