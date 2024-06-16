package Practica_3.ej4;
import Practica_3.GeneralTree;
import Practica_1.ej8.Queue;
public class AnalizadorArbol {
	
	
	public double devolverMaximoPromedio (GeneralTree<AreaEmpresa> a) {
		if(a.isEmpty()) {
			return 0;
		}
		else {
			if(a.isLeaf()) {
				return a.getData().getLat();
			}
			else {
				return this.devolverMaximoPromedioAux(a);
			}
		}
	}
	
	private double devolverMaximoPromedioAux (GeneralTree<AreaEmpresa> a) {
		double max =-1;
		int total_lat=0;
		int cant =0;
		
		GeneralTree<AreaEmpresa> aux;
		Queue <GeneralTree<AreaEmpresa>> cola= new Queue<GeneralTree<AreaEmpresa>>();
		
		cola.enqueue(a);
		cola.enqueue(null);
		
		while(!cola.isEmpty()) {
			aux=cola.dequeue();
			if(aux != null) {
				for(GeneralTree<AreaEmpresa> child : aux.getChildren()) {
					cola.enqueue(child);
					total_lat+=child.getData().getLat();
					cant++;
				}
			}
			else {
				if(!cola.isEmpty()) {
					max= Math.max((total_lat/cant), max);
					cant=0;
					total_lat=0;
					cola.enqueue(null);
				}
			}
		}
		return max;
	}
}
