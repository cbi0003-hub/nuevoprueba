package empresa;

import cliente.Cliente;

// estamos practicando la herencia en java
public class Empresa extends Cliente {
	
	private boolean es_empresa;

	public Empresa(String nombre, String apellido, String dni, boolean es_empresa) {
		super(nombre, apellido, dni);
		this.es_empresa = es_empresa;
	}

	public boolean isEs_empresa() {
		return es_empresa;
	}

	public void setEs_empresa(boolean es_empresa) {
		this.es_empresa = es_empresa;
	}
	
	
	
	

}
