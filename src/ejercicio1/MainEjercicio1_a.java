package ejercicio1;

import java.time.LocalDate;

public class MainEjercicio1_a {

    public static void main(String[] args) {
        
        System.out.println("Creando persona con DNI: AA202020");
        
        try {
            String dniInvalido = "AA202020";
            
            Persona.verificarDNI(dniInvalido);             
            
            Persona p1 = new Persona(dniInvalido, "Juan", "Pérez", LocalDate.of(1990, 5, 10), 
                                     "Masculino", "Calle 123", "1234-5678", "juan@mail.com");
            System.out.println("Persona agregada correctamente");
            
        } catch (ExVerificarDNI e) {
           
            System.out.println("Persona no agregada por no verificar el DNI");
        }

        System.out.println("--------------------------------------------------");

        
        System.out.println("Creando persona con DNI: 20202020");
        try {
            String dniValido = "20202020";
            
            Persona.verificarDNI(dniValido);            
            
            Persona p2 = new Persona(dniValido, "Ana", "García", LocalDate.of(1995, 8, 20), 
                                     "Femenino", "Avenida Siempre Viva 742", "5678-1234", "ana@mail.com");
            System.out.println("Persona agregada correctamente");
            
        } catch (ExVerificarDNI e) {
        	
        	System.out.println("Persona no agregada por no verificar el DNI");
        }
    }
}