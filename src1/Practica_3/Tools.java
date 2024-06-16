package Practica_3;
import java.util.*;
import Practica_1.ej8.Queue;
public class Tools<T> {
	
	//imprimir en pre-orden
	public  void print_preOrden (GeneralTree <T> a) {
		System.out.println(a.getData());
		List <GeneralTree<T>> children = a.getChildren();
		for(GeneralTree<T> child : children) {
			print_preOrden(child);
		}
	}
	
	//retornar lista de los datos de todos los nodos en pre- orden
	public List<T> return_nodos_preOrden (GeneralTree <T> a){
		List<T> lista= new LinkedList<>();
		this.preOrden_list(a, lista);
		return (lista);
	}
	
	//
	private void preOrden_list (GeneralTree<T> a, List <T> lista) {
		lista.add(a.getData());
		for (GeneralTree<T> child : a.getChildren()) {
			preOrden_list(child,lista);
		}
	}
	
	//imprimir en in-orden
	public void print_inOrden (GeneralTree<T> a) {
		if(a.hasChildren()) {
			print_inOrden(a.getChildren().get(0));
		}
		List <GeneralTree<T>> child = a.getChildren();
		System.out.println(a.getData());
		for (int i=1; i< child.size(); i++) {
			print_inOrden(child.get(i));
		}
	}
	
	//retornar lista de los datos de todos los nodos en In-Orden
	public List<T> return_nodos_inOrden(GeneralTree<T>a){
		List <T> lista= new LinkedList<>();
		this.inOrden_list(a, lista);
		return lista;
	}
	
	private void inOrden_list (GeneralTree<T> a, List <T> lista) {
		if(a.hasChildren()) {
			inOrden_list(a.getChildren().get(0), lista);
		}
		List <GeneralTree<T>> child= a.getChildren();
		lista.add(a.getData());
		for(int i=1; i<child.size();i++) {
			inOrden_list(child.get(i), lista);
		}
	}
	
	//Imprimir en Post-Orden
	public void print_PostOrden(GeneralTree<T> a) {
		List <GeneralTree<T>> children= a.getChildren();
		for(GeneralTree<T> child: children) {
			print_PostOrden(child);
		}
		System.out.println(a.getData());
	}
	
	//retornar lista de los datos de todos los nodos en Post-Orden
	public List <T> retunr_nodos_postOden(GeneralTree<T>a){
		List <T> lista= new LinkedList<>();
		this.posOrden_list(a, lista);
		return lista;
	}
	
	private void posOrden_list(GeneralTree<T> a, List<T> lista) {
		for(GeneralTree<T> child : a.getChildren()) {
			posOrden_list(child, lista);
		}
		lista.add(a.getData());
	}
	
	//Imprimir por Niveles
	public void print_niveles(GeneralTree<T> a) {
		GeneralTree<T> aux;
		Queue<GeneralTree<T>> cola = new Queue <GeneralTree<T>>();
		cola.enqueue(a);
		while(!cola.isEmpty()) {
			aux=cola.dequeue();
			System.out.println(aux.getData());
			List <GeneralTree<T>> children= aux.getChildren();
			for(GeneralTree<T> child : children) {
				cola.enqueue(child);
			}
		}
	}
	
	//retornar lista de los datos de todos los nodos
	public List <T> niveles_list(GeneralTree<T> a){
		List<T> lista= new LinkedList<T>();
		GeneralTree<T> aux;
		Queue <GeneralTree<T>> cola = new Queue<GeneralTree<T>>();
		cola.enqueue(a);
		while(!cola.isEmpty()) {
			aux=cola.dequeue();
			lista.add(aux.getData());
			List<GeneralTree<T>> children = aux.getChildren();
			for(GeneralTree<T> child: children) {
				cola.enqueue(child);
			}
		}
		return lista;
	}
}
