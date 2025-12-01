package cliente;

public class Cliente {
	
	// POJO (Plain Object Java )
	
	// propiedades 
	
	private String nombre; 
	private String apellido; 
	private String dni;
	
	// constructor con parametros
	
	public Cliente(String nombre, String apellido, String dni) {
		super();// la llamada al superconstructor
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	} 
	
	public Cliente() {} // constructor vacio

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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}; // constructor vacio 
	
	
	
	
	

}
