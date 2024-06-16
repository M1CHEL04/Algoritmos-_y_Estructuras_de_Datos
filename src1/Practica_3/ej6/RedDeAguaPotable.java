package Practica_3.ej6;
import Practica_3.GeneralTree;
public class RedDeAguaPotable {
	GeneralTree<Character> arbol;
	
	//constructor
	public RedDeAguaPotable(GeneralTree<Character> ab) {
		this.arbol=ab;
	}
	
	
	public double minimoCaudal(double caudal) {
		double minimo = caudal;
		if(this.arbol != null) {
			minimo= minimoAux(this.arbol,caudal);
		}
		return minimo;
	}
	
	private double minimoAux (GeneralTree <Character> a, double caudal) {
		if(a.isLeaf()) {
			return caudal;
		}
		else {
			double DivCaudal= caudal/a.getChildren().size();
			double MinCaudal= Double.MAX_VALUE;
			for (GeneralTree <Character> child : a.getChildren()) {
				double HijosCaudal= minimoAux(child,DivCaudal);
				MinCaudal=Math.min(MinCaudal, HijosCaudal);
			}
			return MinCaudal;
		}
	}
}
