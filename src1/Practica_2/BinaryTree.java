package Practica_2;
import Practica_1.ej8.*;
public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	//constructor
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	//retorna una dato del arbol
	public T getData() {
		return data;
	}

	//pone un dato en el arbol
	public void setData(T data) {
		this.data = data;
	}
	
	/**
	 * retorna el hijo izquierdo
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * retorna el hijo derecho
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}
	
	//agrego hijo izquierdo
	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	//agrego hijo derecho
	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}
	
	//borro hijo izquierdo
	public void removeLeftChild() {
		this.leftChild = null;
	}

	//borro hijo derecho
	public void removeRightChild() {
		this.rightChild = null;
	}
	
	//check si el arbol esta vacio
	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	//
	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
	
	//retorna true si tiene hijo izquierdo
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	//retorna true si tiene hijo derecho
	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	
	@Override
	public String toString() {
		return this.getData().toString();
	}
	
	
	//Ejecicio 2 de la practica 2
	
	//retorna la cantidad de hojas
	public  int contarHojas() {
		int HL=0;
		int HR=0;
		if (this.isEmpty()) {
			return 0;
		}
		else {
			if (this.isLeaf()) {
				return 1;
			}
			if (this.hasLeftChild()) {
				HL=this.getLeftChild().contarHojas();
			}
			if(this.hasRightChild()) {
				HR=this.getRightChild().contarHojas();
			}
			return (HL + HR);
		}
	}
		
    //invierte el orden del arbol
    public BinaryTree<T> espejo(){
    	BinaryTree <T> abEspejo = new BinaryTree <T> (this.getData());
    	if(this.hasLeftChild()) {
    		abEspejo.addRightChild(this.getLeftChild().espejo());
    	}
    	if(this.hasRightChild()) {
    		abEspejo.addLeftChild(this.getRightChild().espejo());
    	}
    	return abEspejo;
    }

	// imprime el arbol por niveles entre dos niveles de altura
	public void entreNiveles(int n, int m){
		if(this.isEmpty()|| n<0 || m<n){
			return;
		}
		BinaryTree <T> aux=null;
		Queue <BinaryTree<T>> cola = new Queue <BinaryTree<T>> ();
		cola.enqueue(this);
		cola.enqueue(null);
		int nivelAct=0;
		while(! cola.isEmpty() && nivelAct <= m) {
			aux= cola.dequeue();
			if(aux != null) {
				if(nivelAct >= n && nivelAct <=m) {
					System.out.println("El dato es: "+this.getData());
				}
				if(this.hasLeftChild()) {
					cola.enqueue(this.getLeftChild());
				}
				if(this.hasRightChild()) {
					cola.enqueue(this.getRightChild());
				}
			}
			else {
				nivelAct++;
				if(!cola.isEmpty()) {
					cola.enqueue(null);
				}
			}
		}
	}	
}

