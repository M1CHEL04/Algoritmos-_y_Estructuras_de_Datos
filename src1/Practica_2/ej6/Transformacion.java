package Practica_2.ej6;
import Practica_2.BinaryTree;
public class Transformacion {
	public BinaryTree <Integer> arbol = new BinaryTree <Integer>();
	
	public BinaryTree <Integer> suma () {
		
		return sumaAux(this.arbol);
	}
	
	private BinaryTree <Integer> sumaAux (BinaryTree<Integer> arbol){
		if(arbol.isLeaf()) {
			return (new BinaryTree<Integer>(0));
		}
		else {
			int cantR=0;
			int cantL=0;
			
			BinaryTree<Integer> arbolTransformado = new BinaryTree<Integer>();
			if(arbol.hasLeftChild()) {
				cantL=arbol.getLeftChild().getData();
				arbolTransformado.addLeftChild(sumaAux(arbol.getLeftChild()));
				cantL+=arbolTransformado.getLeftChild().getData();
			}
			if(arbol.hasRightChild()) {
				cantR= arbol.getRightChild().getData();
				arbolTransformado.addRightChild(sumaAux(arbol.getRightChild()));
				cantR= arbolTransformado.getRightChild().getData();
			}
			
			arbolTransformado.setData(cantR+cantL);
			
			return(arbolTransformado);
		}
	}
}
