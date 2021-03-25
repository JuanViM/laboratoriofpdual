package exception;

public class Ejer3 {

	public static void main(String[] args) {
		
		
		try {
			System.out.println("Este es el try");
			throw new ErrorCreado(" fatality error"); // si quitamos esta parte peta

		}catch(ErrorCreado e) {
			System.out.println("este es el catch");
			 System.out.println(e);
		}
	}

}
