package Practica_2.ej3;
import Practica_2.BinaryTree;
import java.util.*;
public class ContadorArbol {
	BinaryTree <Integer> ab;
	
	//constructor
	public ContadorArbol (int dato) {
		ab= new BinaryTree <Integer>(dato);
	}
	
	//contar numero pares in orden
	public ArrayList <Integer>  numeroParesInOrden () {
		ArrayList <Integer> lista = new ArrayList <Integer>();
		if(! this.ab.isEmpty()) {
			this.recorrer_arbol_in_orden(lista,this.ab);
		}
		return lista;
	}
	
	private void recorrer_arbol_in_orden (ArrayList <Integer> lista, BinaryTree <Integer> arbol){
		if(arbol.hasLeftChild()) {
			this.recorrer_arbol_in_orden(lista, arbol.getLeftChild());
		}
		if(arbol.getData() % 2 == 0) {
			lista.add(arbol.getData());
		}
		if(arbol.hasRightChild()) {
			this.recorrer_arbol_in_orden(lista, arbol.getRightChild());
		}
		
	}
	
	//contar numero pares post Orden
	public ArrayList <Integer> numeroParesPostOreden (){
		ArrayList <Integer> lista = new ArrayList <Integer>();
		if(!this.ab.isEmpty()) {
			this.recorrer_arbol_pot_orden(lista, this.ab);
		}
		return lista;
	}
	
	private void recorrer_arbol_pot_orden (ArrayList <Integer> lista, BinaryTree <Integer> arbol) {
		if(arbol.hasLeftChild()) {
			this.recorrer_arbol_pot_orden(lista, arbol.getLeftChild());
		}
		if(arbol.hasLeftChild()) {
			this.recorrer_arbol_pot_orden(lista, arbol.getRightChild());
		}
		if(arbol.getData() % 2 ==0) {
			lista.add(arbol.getData());
		}
	}
}
