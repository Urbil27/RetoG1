package otros;

public class Serie {
	private int codSerie;
	private String modelo;
	private String marca;
	private String aņoFabricacion;
	public Serie(int cod, String model,String marc, String aņoFabri) {
		codSerie = cod;
		modelo=model;
		marca=marc;
		aņoFabricacion=aņoFabri;
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
	public String getAņoFabricacion() {
		return aņoFabricacion;
	}
	public void setAņoFabricacion(String aņoFabricacion) {
		this.aņoFabricacion = aņoFabricacion;
	}
	
}
