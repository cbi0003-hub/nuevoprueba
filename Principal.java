package principal;

import vehiculos.Automovil;

public class Principal {

	public static void main(String[] args) {

		
		Automovil a1 = new Automovil();
		a1.setMarca("Renault");
		a1.setModelo("Clio");
		a1.setKm(128.0f);
		System.out.println("La marca es :" + a1.getMarca());
		
		Automovil a2 = new Automovil("Ford", "Mustang", 128.0f);

	}

}
