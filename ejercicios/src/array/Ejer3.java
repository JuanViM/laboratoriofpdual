package array;

public class Ejer3 {

	public static void main(String[] args) {
		
		int array1 [] = new int[8];
		 
		array1[0]=1;
		array1[1]=2;
		array1[2]=3;
		array1[3]=4;
		array1[4]=5;
		array1[5]=6;
		array1[6]=7;
		array1[7]=8;
		
		int array2[]= {1,2,3,4,5,6,7,8,9};
		
		System.out.println(array1.length);
		System.out.println(array2.length);
	
		
		
			try {
			for(int i=0;i<numerosCentrales(array1).length;i++) {
			System.out.println(numerosCentrales(array1)[i]);
		}
		}catch(NullPointerException e) {
			
			System.out.println("El array es impar");
		}
		

	}

	public static int [] numerosCentrales(int [] numeros) {
		/*int centrales[] = new int[2];
		if((numeros.length) %2 == 0) {
			for(int i=0;i<=numeros.length-1;i++) {
				if(numeros[i] == numeros.length/2 ) {
					centrales[0]=numeros[i];
				}else if (numeros[i] == (numeros.length/2)+1) {
					centrales[1]=numeros[i];
				}
			}return centrales;
			*/
		
			
			int centrales [] = new int [2];
			if(numeros.length%2 == 0) {
				centrales[0]=numeros[(numeros.length/2)-1];
				centrales[1]=numeros[numeros.length/2];
				return centrales;
			}
	
	return centrales = null;
	
		
	}
}
