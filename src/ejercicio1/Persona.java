package ejercicio1;

import java.time.LocalDate;
import java.util.Iterator;

import javax.swing.tree.ExpandVetoException;

public class Persona {
	
	private String dni;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String genero;
	private String direccion;
	private String telefono;
	private String email;
	 
	public Persona() {
			this.nombre = "sin nombre";
			this.fechaNacimiento = LocalDate.of(2025,1,1);
	}

	public Persona(String dni, String nombre, String apellido, LocalDate fechaNacimiento,
		String genero, String direccion, String telefono, String email) {
			
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}
	
	public static void verificarDNI(String dni) {
		
		int cantidadCaracter = dni.length();
		boolean noEsNumero= false;
		for (int i=0; i<dni.length();i++) {
			
			if(!(Character.isDigit(dni.charAt(i)))) {
				noEsNumero=true;
			}
			
		}
		if((cantidadCaracter !=8) || (noEsNumero==true)) {
			ExVerificarDNI exc1 = new ExVerificarDNI();
			throw exc1;
		}
		
		
		
		
	}
	 
	 
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	 


@Override
public String toString() {
		return ", DNI= " + dni + ", Nombre= " + nombre + ", Apellido= " + apellido +
				", Fecha de Nacimiento= " + fechaNacimiento + ", Genero= " + genero + ", Direccion= " +
				direccion + ", Telefono= " + telefono + ", Email= " + email;
	}
}
