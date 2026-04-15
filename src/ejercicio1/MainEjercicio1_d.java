package ejercicio1;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;

public class MainEjercicio1_d {

	public static void main(String[] args) {
		Persona p1 = new Persona("40890697", "Matias", "Ballesteros", LocalDate.of(1998, 1, 20), "Masculino", "Vilela 2181", "1144556677", "matias@mail.com");
		Persona p2 = new Persona("11111111", "David", "Resca", LocalDate.of(1988, 1, 1), "Masculino", "Falsedad 1", "1111111111", "ejemplo2@gmail.com");
		Persona p3 = new Persona("22222222", "Pablo", "Flores", LocalDate.of(1999, 1, 1), "Masculino", "Falsa 2", "2222222222", "ejemplo3@gmail.com");
		Persona p4 = new Persona("33333333", "Jonatan", "Chavez", LocalDate.of(1995, 1, 1), "Masculino", "Falseti 3", "3333333333", "ejemplo4@gmail.com");
		Persona p5 = new Persona("44444444", "Martin", "Sueldo", LocalDate.of(2000, 1, 1), "Masculino", "Falluta 4", "4444444444", "ejemplo5@gmail.com");
	
		HashSet<Persona> listaPersonas = new HashSet<Persona>();
		listaPersonas.add(p1);
		listaPersonas.add(p2);
		listaPersonas.add(p3);
		listaPersonas.add(p4);
		listaPersonas.add(p5);
		
		System.out.println("LISTA DE PERSONAS");
		Iterator<Persona> it = listaPersonas.iterator();
		
		
		while (it.hasNext()) {
			Persona personaActual = it.next();
			System.out.println(personaActual.toString());
		}
	
	}

}
