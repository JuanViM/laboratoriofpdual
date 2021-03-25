package exception;



public class Ejer1 {

	public static void main(String[] args)throws Exception {
		
		
		try {
			Exception y = new Exception("Este es el error");
			throw y;
		}catch(Exception f){
			System.out.println(f);
		}finally {
			System.out.println("Esta es la frase del finally");
		}
		

	}

}
