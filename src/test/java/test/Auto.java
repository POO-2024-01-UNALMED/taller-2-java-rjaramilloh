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
		int i=0;
		for (int j = 0;j<asientos.length;j++) {
			if( asientos[j] instanceof Asiento  ) {
				i++;
			}
		}
		return i;
	}
	public String verificarIntegridad() {
		String prueba = "Auto origina";
		for (int i = 0;i<asientos.length;i++) {
			if ((asientos[i].registro != registro) || (registro!=motor.registro)) {
				prueba = "Las piezas no son originales";
			}
		}
		return prueba;
	}
}
