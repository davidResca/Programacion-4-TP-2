package ejercicio1;

public class ExVerificarDNI extends RuntimeException {

	@Override
	public String getMessage() {
		
		return "El DNI debe tener 8 dígitos numéricos";
	}
	
	

}
