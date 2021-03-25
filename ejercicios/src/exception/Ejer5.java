package exception;

public class Ejer5 {

	public static void main(String[] args)throws ErrorCreado {
		
		try {
			f();
		}catch(Exception e) {
			System.out.println(e);
		}
	
		
	}

	public static void g()throws ErrorCreado {
		throw new ErrorCreado(" fatality error");
	}
	
	public static void f() throws ErrorCreado {
		try {
			g();
		}catch(ErrorCreado e) {
			System.out.println("Exploto");
			System.out.println(e);
			throw new ErrorCreado(" probando");
			
			
		}
	}
}
