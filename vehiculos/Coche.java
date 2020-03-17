package vehiculos;

public class Coche extends Vehiculo {
	
	private int numPuertas;
	private float capacidadMaletero;
		
	public Coche(int numP,float capMa,String matr,int numB, String col, int numAs, int se, float pre, boolean pint) {
		super(matr,numB, col, numAs, se, pre, pint);
		numPuertas=numP;
		capacidadMaletero=capMa;

	}


	public int getNumPuertas() {
			return numPuertas;
		}

		public void setNumPuertas(int numPuertas) {
			this.numPuertas = numPuertas;
		}

		public float getCapacidadMaletero() {
			return capacidadMaletero;
		}

		public void setCapacidadMaletero(float capacidadMaletero) {
			this.capacidadMaletero = capacidadMaletero;
		}

		public String toString() {
			return "Este coche es"+color+"El numero de Bastidor es "+numBastidor+" su matricula es: "+matricula+" tiene "+numAsientos+" asientos y el numero de serie es "+serie+". tiene "+numPuertas+" puertas y una capacidad de maletero de "+capacidadMaletero;
		}

}
