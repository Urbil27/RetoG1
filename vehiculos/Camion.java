package vehiculos;

public class Camion extends Vehiculo {

	private float carga;
	private char tipoMercancia;
	
	Camion(float car, char tipMer, int numB, String col, int numAs, int se, float pre, boolean pint) {
		super(numB, col, numAs, se, pre, pint);
		carga=car;
		tipoMercancia=tipMer;
	}
}
