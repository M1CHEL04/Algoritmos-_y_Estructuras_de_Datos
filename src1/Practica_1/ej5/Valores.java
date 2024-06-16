package Practica_1.ej5;

public class Valores {
	double prom;
	int max;
	int min;
	
	//constructor vacio
	public Valores () {
		
	}
	
	//constructor
	public Valores (double prom, int max, int min) {
		this.setMax(max);
		this.setMin(min);
		this.setProm(prom);
	}
	
	//getters y setters 
	public double getProm() {
		return prom;
	}
	public void setProm(double prom) {
		this.prom = prom;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	
}
