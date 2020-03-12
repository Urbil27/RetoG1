package vehiculos;

public class Vehiculo {
	
	protected int numBastidor;
	protected String color;
	protected int numAsientos;
	protected int serie;
	protected float precio;
	protected boolean pintado;
	
		Vehiculo(int numB, String col, int numAs, int se, float pre, boolean pint){
			numBastidor=numB;
			color=col;
			numAsientos=numAs;
			serie=se;
			precio=pre;
			pintado=pint;
		}
		
		public int getNumBastidor() {
			return numBastidor;
		}
		
		public void setNumBastidor(int numBastidor) {
			this.numBastidor = numBastidor;
		}
		
		public String getColor() {
			return color;
		}
		
		public void setColor(String color) {
			this.color = color;
		}
		
		public int getNumAsientos() {
			return numAsientos;
		}
		
		public void setNumAsientos(int numAsientos) {
			this.numAsientos = numAsientos;
		}
		
		public int getSerie() {
			return serie;
		}
		
		public void setSerie(int serie) {
			this.serie = serie;
		}
		
		public float getPrecio() {
			return precio;
		}
		
		public void setPrecio(float precio) {
			this.precio = precio;
		}
		public void setPintado(boolean pintado) {
			this.pintado = pintado;
		}
		
}
