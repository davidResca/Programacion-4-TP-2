package ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class MainEjercicio1_b {

	public static void main(String[] args) {
		
		Empleado emp1 = new Empleado("40890697", "Matias", "Ballesteros", LocalDate.of(1998, 1, 20), "Masculino", "Vilela 2181", "1161689683", "ejemplo1@gmail.com", "Vendedor");
		Empleado emp2 = new Empleado("11111111", "David", "Resca", LocalDate.of(1988, 1, 1), "Masculino", "Falsedad 1", "1111111111", "ejemplo2@gmail.com", "Recepcionista");
		Empleado emp3 = new Empleado("22222222", "Pablo", "Flores", LocalDate.of(1999, 1, 1), "Masculino", "Falsa 2", "2222222222", "ejemplo3@gmail.com", "Seguridad");
		Empleado emp4 = new Empleado("33333333", "Jonatan", "Chavez", LocalDate.of(1995, 1, 1), "Masculino", "Falseti 3", "3333333333", "ejemplo4@gmail.com", "Auxiliar");
		Empleado emp5 = new Empleado("44444444", "Martin", "Sueldo", LocalDate.of(2000, 1, 1), "Masculino", "Falluta 4", "4444444444", "ejemplo5@gmail.com", "Vendedor");
		

		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado> ();
		
		try {
			Persona.verificarDNI(emp1.getDni());
			listaEmpleados.add(emp1);
		}
		catch (ExVerificarDNI e) {
			System.out.println("Empleado no agregado por no verificar el DNI"); 
		}
		
		try {
			Persona.verificarDNI(emp2.getDni());
			listaEmpleados.add(emp2);
		}
		catch (ExVerificarDNI e) {
			System.out.println("Empleado no agregado por no verificar el DNI"); 
		}
		
		try {
			Persona.verificarDNI(emp3.getDni());
			listaEmpleados.add(emp3);
		}
		catch (ExVerificarDNI e) {
			System.out.println("Empleado no agregado por no verificar el DNI"); 
		}
		
		try {
			Persona.verificarDNI(emp4.getDni());
			listaEmpleados.add(emp4);
		}
		catch (ExVerificarDNI e) {
			System.out.println("Empleado no agregado por no verificar el DNI"); 
		}
		
		try {
			Persona.verificarDNI(emp5.getDni());
			listaEmpleados.add(emp5);
		}
		catch (ExVerificarDNI e) {
			System.out.println("Empleado no agregado por no verificar el DNI"); 
		}
		
		
		System.out.println("LISTA DE EMPLEADOS");
		Iterator<Empleado> it = listaEmpleados.iterator();
		
		while (it.hasNext()) {
			Empleado empleadoActual = it.next();
			System.out.println(empleadoActual.toString());
		}
	}

}
