package exception;


 class ExDos extends Exception {
	  
    public ExDos(String mensaje) {
        super(mensaje);
    }
   
    public static void imprimir(ExDos mensaje) {
        System.out.println(mensaje);
    }
   
}

public class Alberto {

    public static void main(String[] args) throws ExDos {

    	
        try {
          
        	throw new ExDos("");
                    
        } catch (Exception ex) {
            System.out.println("Error.");
        }

 

    }

 

}

