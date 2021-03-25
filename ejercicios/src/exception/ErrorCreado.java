package exception;

class ErrorCreado extends Exception {
	String mensaje;

	public ErrorCreado(String mensaje2) {
		mensaje=mensaje2;
	}

	public String toString() {
		return ("Este es mi mensaje de error"+mensaje);
	}
}
