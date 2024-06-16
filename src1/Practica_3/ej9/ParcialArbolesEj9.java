package Practica_3.ej9;
import Practica_3.GeneralTree;
import Practica_1.ej8.Queue;
public class ParcialArbolesEj9 {
	
	public static boolean esDeSeleccion(GeneralTree<Integer> arbol) {
		if (arbol == null || arbol.isEmpty()) {
			return false;
		}
		else {
			return esDeSeleccionPrivado(arbol);
		}
	}
	
	private static boolean esDeSeleccionPrivado(GeneralTree<Integer> arbol) {
		Queue<GeneralTree<Integer>> cola= new Queue <GeneralTree<Integer>>();
		int min;
		boolean ok=true;
		GeneralTree<Integer> aux= new GeneralTree<Integer>();
		cola.enqueue(arbol);
		while(!cola.isEmpty() && ok) {
			aux=cola.dequeue();
			min= Integer.MAX_VALUE;
			for (GeneralTree<Integer> child: aux.getChildren()) {
				cola.enqueue(child);
				min=Math.min(min, child.getData());
			}
			if(!aux.isLeaf() && aux.getData() != min) {
				ok=false;
			}
		}
		return ok;
	}
}
