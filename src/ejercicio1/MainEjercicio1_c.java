package ejercicio1;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.TreeSet;

public class MainEjercicio1_c {

	public static void main(String[] args) {
		
		TreeSet<Empleado> listaEmpleados = new TreeSet<Empleado>();
		
		try {
			Persona.verificarDNI("20202020");
			listaEmpleados.add(new Empleado("20202020", "Juan", "Pérez", LocalDate.of(1990, 5, 10), "Masculino", "Calle 123","1234-5678", "juan@mail.com", "Desarrollador"));
		}
        catch (ExVerificarDNI e) 
        { 
        	System.out.println("Empleado no agregado por no verificar el DNI");
        }
		
		try {
			Persona.verificarDNI("20202020");
			listaEmpleados.add(new Empleado("20202020", "Juan", "Pérez", LocalDate.of(1990, 5, 10), "Masculino", "Calle 123","1234-5678", "juan@mail.com", "Desarrollador"));
		}
        catch (ExVerificarDNI e) 
        { 
        	System.out.println("Empleado no agregado por no verificar el DNI");
        }
		
		try {
			Persona.verificarDNI("03340943");
			listaEmpleados.add(new Empleado("03340943", "Ana", "García", LocalDate.of(1985, 3, 22), "Femenino",  "Av. Siempre Viva 742","5678-1234", "ana@mail.com", "Recursos Humanos"));
		}
        catch (ExVerificarDNI e) 
        { 
        	System.out.println("Empleado no agregado por no verificar el DNI");
        }
		
		try {
			Persona.verificarDNI("11223344");
			listaEmpleados.add(new Empleado("11223344", "Carlos", "López", LocalDate.of(2000, 11, 15),"Masculino", "Bulevar 456", "2345-6789", "carlos@mail.com", "Contabilidad"));
		}
		catch (ExVerificarDNI e) 
	    { 
	       	System.out.println("Empleado no agregado por no verificar el DNI");
	    }
	        
		try {
			Persona.verificarDNI("55667788");    
			listaEmpleados.add(new Empleado("55667788", "María", "Martínez", LocalDate.of(1978, 7, 30), "Femenino",  "Calle Falsa 123", "3456-7890", "maria@mail.com", "Ventas"));
		}
		catch (ExVerificarDNI e) 
		{ 
		    System.out.println("Empleado no agregado por no verificar el DNI");
		}
		try {
			Persona.verificarDNI("99001122");        
			listaEmpleados.add(new Empleado("99001122", "Luis", "González", LocalDate.of(1995, 1, 5),  "Masculino", "Pasaje del Sol 789", "4567-8901", "luis@mail.com", "Sistemas"));
		}
		catch (ExVerificarDNI e) 
		{ 
		    System.out.println("Empleado no agregado por no verificar el DNI");
		}			

		
        Iterator<Empleado> it = listaEmpleados.iterator();
        while (it.hasNext()) {
            Empleado e = it.next();
            System.out.println(e);
        }

	}

}
