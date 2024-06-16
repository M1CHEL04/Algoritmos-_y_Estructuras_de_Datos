package Practica_3.ej4;
public class AreaEmpresa {
	String ident;
	int lat;
	
	//constructor
	public AreaEmpresa (String ident, int lat) {
		this.setIdent(ident);
		this.setLat(lat);
	}
	
	//constructor vacio
	public AreaEmpresa() {
		
	}
	
	//getters y setters
	public String getIdent() {
		return ident;
	}
	public void setIdent(String ident) {
		this.ident = ident;
	}
	public int getLat() {
		return lat;
	}
	public void setLat(int lat) {
		this.lat = lat;
	}
	
	
}
