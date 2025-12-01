package vehiculos;

public class Moto extends Automovil {
	
	private int cilindrada; 
	private boolean dos_tiempos; 
	private boolean cuatro_tiempos;
	
	public Moto(int cilindrada, boolean dos_tiempos, boolean cuatro_tiempos) {
		super(); //super constructor de Automovil
		this.cilindrada = cilindrada;
		this.dos_tiempos = dos_tiempos;
		this.cuatro_tiempos = cuatro_tiempos;
	}
	
	public Moto() {}; // constructor vacio

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public boolean isDos_tiempos() {
		return dos_tiempos;
	}

	public void setDos_tiempos(boolean dos_tiempos) {
		this.dos_tiempos = dos_tiempos;
	}

	public boolean isCuatro_tiempos() {
		return cuatro_tiempos;
	}

	public void setCuatro_tiempos(boolean cuatro_tiempos) {
		this.cuatro_tiempos = cuatro_tiempos;
	} 
	
	

}
