package Practica_2.ej4;
import Practica_2.BinaryTree;
public class RedBinariaLlena {
	BinaryTree <Integer> ab;
	
	//constructor
	public RedBinariaLlena () {
		ab= new BinaryTree <Integer> ();
	}
	
	//resuelvo lo pedido por el enunciado
	public int retardoReenvio () {
		int suma=0;
		if(this.ab.isEmpty()) {
			return -1;
		}
		else {
			suma= retardoReenvioPrivado(this.ab);
		}
		
		return suma;
	}
	
	private int retardoReenvioPrivado (BinaryTree <Integer> arbol) {
		if(!arbol.isLeaf()) {
			return (Math.max((arbol.getData()+retardoReenvioPrivado(arbol.getLeftChild())), (arbol.getData()+retardoReenvioPrivado(arbol.getRightChild()))));
		}
		else {
			return arbol.getData();
		}
	}
}
