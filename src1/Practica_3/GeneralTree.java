package Practica_3;
import Practica_1.ej8.Queue;
import java.util.LinkedList;
import java.util.List;

public class GeneralTree<T>{
	private T data;
	private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>(); 

	
	/*El ejercicio 1 es mas que nada el analisis del codogio, en mi caso particular
	 * realizo comentarios descriptivos de cada metodo de la clase
	 */
	
	//constructor vacio
	public GeneralTree() {
		
	}
	
	//constructor con un un parametro y el dato
	public GeneralTree(T data) {
		this.data = data;
	}

	//constructor con el parametro del dato y una lista de hijos
	public GeneralTree(T data, List<GeneralTree<T>> children) {
		this(data);
		this.children = children;
	}	
	
	//retorna el dato
	public T getData() {
		return data;
	}

	//setea el data en el nodo
	public void setData(T data) {
		this.data = data;
	}

	//retorna la lista de hijos
	public List<GeneralTree<T>> getChildren() {
		return this.children;
	}
	
	//setea una lista de hijos
	public void setChildren(List<GeneralTree<T>> children) {
		if (children != null)
			this.children = children;
	}
	
	//añade un nodo a la lista de hijos
	public void addChild(GeneralTree<T> child) {
		this.getChildren().add(child);
	}

	//retorna true si no tiene hijos y false si tiene hijos
	public boolean isLeaf() {
		return !this.hasChildren();
	}
	
	//retorna verdadero si tiene al menos un hijo y false si no tiene
	public boolean hasChildren() {
		return !this.children.isEmpty();
	}
	
	//retorna true si esta vacio el nodo y false si no lo esta 
	public boolean isEmpty() {
		return this.data == null && !this.hasChildren();
	}

	//borra un hijo del nodo que se le mando
	public void removeChild(GeneralTree<T> child) {
		if (this.hasChildren())
			children.remove(child);
	}
	
	/*
	 * Ejercicio 3: completar los siguientes metodos:
	 */
	
	//Retorna la altura del arbol, es decir, la longitud del camino mas largo desde el nodo raiz hasta una hoja
	public int altura() {	 
		int alt=0;
		if(this.isEmpty()) {
			return -1;
		}
		List<GeneralTree<T>> children= this.getChildren();
		for(GeneralTree<T> child : children) {
			alt=Math.max(child.altura(), alt);
		}
		if(this.isLeaf()) {
			return 0;
		}
		return alt+1;
	}
	
	//Retorna la profundidad o nivel del dato en el arbol. El nivel de un nodo es la longitud del unico camino de la raiz al nodo
	public int nivel(T dato){
		int nivel=0;
		boolean encontre= false;
		Queue <GeneralTree<T>> cola = new Queue<GeneralTree<T>>();
		cola.enqueue(this);
		cola.enqueue(null);
		while(!cola.isEmpty()&& !encontre) {
			GeneralTree<T> aux= cola.dequeue();
			if(aux != null && !encontre) {
				if(dato == aux.getData()) {
					encontre=true;
				}
				for(GeneralTree <T> child : aux.getChildren()) {
					cola.enqueue(child);
				}
			}
			else {
				if(!cola.isEmpty()) {
					cola.enqueue(null);
					nivel++;
				}
			}
		}
		return nivel;
	  }

	//Retorna la amplitud de un arbol. Esto se define como la cantidad de nodos que se encuentran en un nivel que posee la mayor cantidad de nodos.
	public int ancho(){
		int cant=0;
		int max=0;
		boolean encontre=false;
		Queue <GeneralTree<T>> cola = new Queue<GeneralTree<T>>();
		cola.enqueue(this);
		cola.enqueue(null);
		while(!cola.isEmpty() && !encontre) {
			GeneralTree<T> aux = cola.dequeue();
			if(aux != null) {
				for(GeneralTree<T> child : aux.getChildren()) {
					cola.enqueue(child);
					cant++;
				}
			}
			else {
				if(!cola.isEmpty()) {
					if(cant>max) {
						max=cant;
					}
					cant=0;
					cola.enqueue(null);
				}
			}
		}
		return max;
	}
	
	/*
	 * Realizo el ejercicio 5 de la practica, este cuenta con 1 metodo publico 
	 * y dos metodos privados.
	 */
	
	public boolean esAncestro(T a, T b) {
		if(this.isEmpty() || this.isLeaf()) {
			return false;
		}
		GeneralTree<T> aux = this.recorridoP1(this,a);
		if(aux.isEmpty() || aux.isLeaf()) {
			return false;
		}
		return this.recorridoP2(aux, b);
	}
	
	//La funcion principal de este metodo es buscar el nodo antecesor, si lo encuetra retorna ese mismo y si no, retorna null
	private GeneralTree<T> recorridoP1 (GeneralTree<T> arbol,T a){
		Queue <GeneralTree<T>> cola = new Queue<GeneralTree<T>>();
		boolean encontre=false;
		GeneralTree<T> arb=null;
		GeneralTree<T> aux;
		cola.enqueue(arbol);
		cola.enqueue(null);
		while(!cola.isEmpty() && !encontre) {
			aux=cola.dequeue();
			if(aux != null) {
				if(aux.getData().equals(a)) {
					arb=aux;
					encontre=true;
				}
				for(GeneralTree<T> child : aux.getChildren()) {
					cola.enqueue(child);
				}
			}
			else {
				if(!cola.isEmpty()) {
					cola.enqueue(null);
				}
			}
		}
		return arb;
	}
	
	
	//La funcion de este metodo es, una vez encontrado el antecesor, en base a ese buscar su descendiente. Si lo encontra retorna true y si no lo encuentra retorna false
	private boolean recorridoP2(GeneralTree<T> arbol, T b) {
		Queue <GeneralTree<T>> cola= new Queue<GeneralTree<T>>();
		GeneralTree<T> aux;
		cola.enqueue(arbol);
		cola.enqueue(null);
		while(!cola.isEmpty()) {
			aux=cola.dequeue();
			if(aux != null) {
				if(aux.getData().equals(b)) {
					return true;
				}
				for(GeneralTree<T> child : aux.getChildren()) {
					cola.enqueue(child);
				}
			}
			else {
				if(!cola.isEmpty()) {
					cola.enqueue(null);
				}
			}
		}
		return false;
	}
}