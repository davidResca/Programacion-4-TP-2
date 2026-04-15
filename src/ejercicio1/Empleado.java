package ejercicio1;

import java.time.LocalDate;
import java.util.Objects;

public class Empleado extends Persona implements Comparable<Empleado>{
	
	private final int legajo;
	private String puesto;
	private static int contador= 1000;	
	
	
	public Empleado() {
		super();		
		this.legajo = contador++;
		this.puesto = "sin puesto asignado";
	}
	
	@Override
	public int compareTo(Empleado proximoEmpleado) {
		//return Integer.compare(this.legajo, proximoEmpleado.getLegajo());
		return this.getDni().compareTo(proximoEmpleado.getDni());
	}
	
	public static int devuelveProximoLegajo() {
		
		return contador;
	}
	
	public Empleado(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String genero,
			String direccion, String telefono, String email, String puesto) {		
		super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
		this.legajo = contador++;
		this.puesto = puesto;
	}

	public int getLegajo() {
		return legajo;
	}
	
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
		
	
	@Override
	public String toString() {
		return "Empleado legajo= " + legajo + ", puesto= " + puesto + super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(legajo, puesto);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return legajo == other.legajo && Objects.equals(puesto, other.puesto);
	}
	
}
