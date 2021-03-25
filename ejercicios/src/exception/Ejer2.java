package exception;


public class Ejer2 {
	
	public static void main(String[] args)throws Exception {
		
		try {
			
			 System.out.println("Esto es el try");
			 throw new ErrorCreado(" fatality error");
		 }catch(ErrorCreado e) {
			 
			 System.out.println("este es el catch");
			 System.out.println(e);
		 }finally {
			System.out.println("esto es el finally");
		 }

	}

}
