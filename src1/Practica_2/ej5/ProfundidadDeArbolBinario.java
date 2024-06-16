package Practica_2.ej5;
import Practica_2.BinaryTree;
import Practica_1.ej8.*;
public class ProfundidadDeArbolBinario {
	BinaryTree <Integer> ab = new BinaryTree <Integer>();
	
	public int sumaElementosProfundidad (int nivel) {
		int indice=0;
		int total=0;
		BinaryTree<Integer> aux= new BinaryTree<Integer>();
		Queue<BinaryTree<Integer>> cola= new Queue <BinaryTree<Integer>>();
		
		if(!ab.isEmpty()) {
			cola.enqueue(ab);
			cola.enqueue(null);
			while(!cola.isEmpty() && indice <=nivel) {
				aux=cola.dequeue();
				if(aux != null) {
					if(indice == nivel) {
						total+= aux.getData();
					}
					if(aux.hasLeftChild()) {
						cola.enqueue(aux.getLeftChild());
					}
					if(aux.hasRightChild()) {
						cola.enqueue(aux.getRightChild());
					}
				}
				else {
					indice++;
					if(!cola.isEmpty()) {
						cola.enqueue(null);
					}
				}
			}
		}
		return total;
	}
}
