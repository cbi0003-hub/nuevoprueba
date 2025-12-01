package vehiculos;

public class Automovil {
	
	//POJO
	
	private String marca;
	private String modelo;
	private Float km;
	
	public Automovil() {}; //constr vacio
	
	public Automovil(String marca, String modelo, Float km) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.km = km;
	}
	// getters and setter 
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Float getKm() {
		return km;
	}
	public void setKm(Float km) {
		this.km = km;
	}
	
	
	

}
