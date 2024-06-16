package Practica_3.ej7;
import Practica_3.GeneralTree;
import java.util.*;
public class Caminos {
	GeneralTree<Integer> arbol;
	
	//constructor
	public Caminos (GeneralTree<Integer>ab) {
		this.arbol=ab;
	}
	
	//Metedo solicitado por el ejercicio 7
	public List <Integer> caminoAHojaMasLejana(){
		List <Integer> camAct= new LinkedList<Integer>();
		List <Integer> camMax= new LinkedList<Integer>();
		if(this.arbol != null) {
			if(!this.arbol.isEmpty()) {
				caminoAux(this.arbol,camAct,camMax);
			}
		}
		return camMax;
	}
	
	//Metodo privado para el correcto desarrollo del metodo "caminoAHojaMasLejana"
	private void caminoAux (GeneralTree <Integer> a, List <Integer> camAct, List <Integer> camMax){
		camAct.add(a.getData());
		if(!a.isLeaf()) {
			for (GeneralTree<Integer> child : a.getChildren()) {
				caminoAux(child, camAct, camMax);
			}
		}
		else if(camAct.size()>camMax.size()){
			camMax.removeAll(camMax);
			camMax.addAll(camAct);
		}
		camAct.remove(camAct.size()-1);
	}
}
