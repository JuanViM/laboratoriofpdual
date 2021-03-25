package array;

public class Ejer4 {

	public static void main(String[] args) {
		 int [] array1 = new int [5];
		 array1[0]=1;
		 array1[1]=2;
		 array1[2]=3;
		 array1[3]=4;
		 array1[4]=5;
		 
		 int array2[] = {5,6,7,8,9,1,2,3,4};
		 reves(array2);
	}

	
	public static int [] reves(int numeros[]) {
		int reves [] = new int [numeros.length];
			for(int i=0;i<numeros.length;i++) {
				reves[i]=numeros[numeros.length-1-i];
			}
		
		return reves;
	}
	}
	

