package test;

public class Auto {
	String modelo;
	int precio;
	Asiento asientos[];
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	public int cantidadAsientos() {
		return asientos.length;
	}
	public String verificarIntegridad() {
		String prueba = null;
		for (int i = 0;i<asientos.length;i++) {
			if ((asientos[i].registro!=registro) || (registro!=motor.registro)) {
				prueba ="Las piezas no son originales";
				break;
			}
			else {
				prueba ="Auto original";
			}
		}
		return prueba;
	}
}
