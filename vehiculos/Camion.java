package vehiculos;

public class Camion extends Vehiculo {

	private float carga;
	private char tipoMercancia;
	
	public Camion(float car, char tipMer,String matr, int numB, String col, int numAs, int se, float pre, boolean pint) {
		super(matr,numB, col, numAs, se, pre, pint);
		carga=car;
		tipoMercancia=tipMer;
	}

	public float getCarga() {
		return carga;
	}

	public void setCarga(float carga) {
		this.carga = carga;
	}

	public char getTipoMercancia() {
		return tipoMercancia;
	}

	public void setTipoMercancia(char tipoMercancia) {
		this.tipoMercancia = tipoMercancia;
	}
	public String toString() {
		return "Este camion es "+color+"El numero de Bastidor es "+numBastidor+" su matricula es: "+matricula+" tiene "+numAsientos+" asientos y el numero de serie es "+serie+". Puede con "+carga+"Kg de carga y el tipo de mercancia es "+tipoMercancia;
	}
}
