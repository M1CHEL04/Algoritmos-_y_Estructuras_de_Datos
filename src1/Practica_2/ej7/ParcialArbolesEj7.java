package Practica_2.ej7;
import Practica_2.BinaryTree;
import Practica_1.ej8.Queue;
public class ParcialArbolesEj7 {
	public BinaryTree<Integer> arbol= new BinaryTree<Integer>();
	
	public boolean isLeftTree (int num) {
		boolean aux;
		BinaryTree<Integer> ab= buscar_nodo(num);
		
		if(ab != null) {
			System.out.println("Se ha encontrado el nodo con el numero "+num);
			int L;
			int R;
			
			if(ab.hasLeftChild()) {
				L=cant_hijo_unico(ab.getLeftChild());
			}
			else {
				L=-1;
			}
			
			if(ab.hasRightChild()) {
				R=cant_hijo_unico(ab.getRightChild());
			}
			else {
				R=-1;
			}
			
			aux= L>R;
		}
		else {
			System.out.println("No se ha encontro ningun nodo con el numero "+num);
			aux= false;
		}
		
		return aux;
	}
	
	private BinaryTree <Integer> buscar_nodo (int numero){
		BinaryTree <Integer> aux= new BinaryTree<Integer>();
		Queue <BinaryTree<Integer>> cola= new Queue <BinaryTree<Integer>> ();
		boolean encontre=false;
		
		cola.enqueue(arbol);
		cola.enqueue(null);
		while(!cola.isEmpty() && !encontre) {
			aux=cola.dequeue();
			if(aux != null) {
				if(!aux.isEmpty()) {
					if(aux.getData() == numero) {
						encontre=true;
					}
				if(aux.hasLeftChild()) {
					cola.enqueue(aux.getLeftChild());
					}
				if(aux.hasRightChild()) {
					cola.enqueue(aux.getRightChild());
					}
				}
			}
			else {
				if(!cola.isEmpty()) {
					cola.enqueue(null);
				}
			}
		}
		return aux;
	}
	
	private int cant_hijo_unico (BinaryTree <Integer> ab) {
		int cant=0;
		
		if(!ab.isLeaf()) {
			if(!(ab.hasLeftChild() && ab.hasRightChild())) {
				cant=1;
			}
		}
		
		if(ab.hasLeftChild()) {
			cant+=cant_hijo_unico(ab.getLeftChild());
		}
		
		if(ab.hasRightChild()) {
			cant+=cant_hijo_unico(ab.getRightChild());
		}
		
		return cant;
	}
}
