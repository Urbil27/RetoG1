package otros;

public class Serie {
	private int codSerie;
	private String modelo;
	private String marca;
	private String a�oFabricacion;
	public Serie(int cod, String model,String marc, String a�oFabri) {
		codSerie = cod;
		modelo=model;
		marca=marc;
		a�oFabricacion=a�oFabri;
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
	public String getA�oFabricacion() {
		return a�oFabricacion;
	}
	public void setA�oFabricacion(String a�oFabricacion) {
		this.a�oFabricacion = a�oFabricacion;
	}
	
}
