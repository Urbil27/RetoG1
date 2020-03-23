package otros;

public class Serie {
	private int codSerie;
	private String modelo;
	private String marca;
	private String añoFabricacion;
	public Serie(int cod, String model,String marc, String añoFabri) {
		codSerie = cod;
		modelo=model;
		marca=marc;
		añoFabricacion=añoFabri;
	}
	public int getCodSerie() {
		return codSerie;
	}
	public void setCodSerie(int codSerie) {
		this.codSerie = codSerie;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getAñoFabricacion() {
		return añoFabricacion;
	}
	public void setAñoFabricacion(String añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}
	
}
