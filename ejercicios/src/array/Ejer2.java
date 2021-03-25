package array;

public class Ejer2 {

	public static void main(String[] args) {
		 
		int array1[] = new int[8]; //Esto es una manera de declarar 
									//los arrays pero debemos espcificarles el tamaño
		
		 array1[0]=1;
		 array1[1]=1;
		 array1[2]=1;
		 array1[3]=4;
		 array1[4]=5;
		 array1[5]=6;
		 array1[6]=7;
		 array1[7]=3;
		int [] array2 = {4,6,7,8,9,-5,0,1}; //esto es otra forma de declarar arrays
		
		System.out.println(encuentranumeros(array1));
	}

	public static boolean encuentranumeros(int [] numeros) {
		 
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]==2 || numeros[i]==3) {
				return false;
			}
		}
		return true;
		
	}
	
}
