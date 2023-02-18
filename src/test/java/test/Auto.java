package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int contador = 0;
		for (Asiento asiento:asientos) {
			if (asiento != null) {
				contador++;
			}
		}
		return contador;
	}
	
	public String verificarIntegridad() {
		if (this.registro == motor.registro) {
			for(Asiento asiento:asientos) {
				if (asiento!= null) {
					if (this.registro != asiento.registro) { 
						return "Las piezas no son originales";
				}
			}	
		}
	}
	return "Auto original";	
	
  }
}