package persona;

import cliente.Cliente;

public class Persona extends Cliente {
	
	//POJO
	
	private boolean es_persona ;

	public Persona(String nombre, String apellido, String dni, boolean es_persona) {
		super(nombre, apellido, dni);
		this.es_persona = es_persona;
	}

	public boolean isEs_persona() {
		return es_persona;
	}

	public void setEs_persona(boolean es_persona) {
		this.es_persona = es_persona;
	}
	
	

}
