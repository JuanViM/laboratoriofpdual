package Objetos;

public class Cliente {

	private String nombre;
	private String apellido;
	private int DNI;
	private int idcliente;
	private String direccion;

public Cliente(String nombre,String apellido,int DNI, int idcliente,String direccion) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.DNI=DNI;
		this.idcliente=idcliente;
		this.direccion=direccion;
	}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre=nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido=apellido;
}
public int getDNI() {
	return DNI;
}
public void setDNI(int DNI) {
	this.DNI=DNI;
}
public int getidcliente() {
	return idcliente;
}
public void setidcliente(int idcliente) {
	this.idcliente=idcliente;
}
public String getdireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion=direccion;
}


public String toString() {
	return "Cliente nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", idcliente=" + idcliente
			+ ", direccion=" + direccion + "]";
}







}
