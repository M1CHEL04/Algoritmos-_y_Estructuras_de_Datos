package Practica_3.ej11;
import Practica_3.GeneralTree;
import Practica_1.ej8.Queue;
public class ParcialArbolesEj11 {
	
	public static boolean resolver (GeneralTree<Integer> arbol) {
		boolean creciente;
		if (arbol == null || arbol.isEmpty()) {
			creciente= false;
		}
		else {
			creciente= resolverPrivate(arbol);
		}
		return creciente;
	}
	
	private static boolean resolverPrivate (GeneralTree<Integer> arbol) {
		
		boolean creciente= true;
		int cant_nivel_act=0;
		int cant_nivel_ant=1;
		
		GeneralTree <Integer> aux;
		Queue <GeneralTree<Integer>> cola = new Queue <GeneralTree<Integer>>();
		
		cola.enqueue(arbol);
		cola.enqueue(null);
		
		while (!cola.isEmpty() && creciente) {
			aux=cola.dequeue();
			if(aux != null) {
				for (GeneralTree<Integer> child : aux.getChildren()) {
					cola.enqueue(child);
					cant_nivel_act++;
				}
			}
			else {
				if(!cola.isEmpty()) {
					if(cant_nivel_act != (cant_nivel_ant +1)) {
						creciente= false;
					}
					cant_nivel_ant=cant_nivel_act;
					cant_nivel_act=0;
					cola.enqueue(null);
				}
			}
		}
		
		return creciente;
	}
}
