package array;

public class Ejer5 {

	public static void main(String[] args) {
		String array1[] = new String[8];
		array1[0] = "a";
		array1[1] = "b";
		array1[2] = "c";
		array1[3] = "1";
		array1[4] = "d";
		array1[5] = "e";
		array1[6] = "f";
		array1[7] = "g";

		String array2[] = { "a", "a", "c", "1", "d", "e", "3" };

		String array3[];
		array3 = listanumero(array2);
		for (int i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
		}
	}

	public static String[] listanumero(String numeros[]) {

		int contador = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i].matches(".*\\d.*")) {
				contador++;
			}

		}

		String retornado[] = new String[contador];
		int e=0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i].matches(".*\\d.*")) {
				retornado[e++] = numeros[i];
			}

		}
		return retornado;

	}
}