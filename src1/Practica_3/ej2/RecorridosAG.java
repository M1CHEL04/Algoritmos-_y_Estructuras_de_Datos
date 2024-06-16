package Practica_3.ej2;
import java.util.*;
import Practica_3.GeneralTree;
import Practica_1.ej8.Queue;
public class RecorridosAG {
	
	//retorna numero impares mayores a un valor con recorrido Pre-Orden
	public List <Integer> numerosImparesMayoresQuePreOrden(GeneralTree <Integer> a , Integer n){
		List <Integer> lista= new LinkedList<>();
		if(!a.isEmpty()) {
			this.numerosImparesPreAux(a, n, lista);
		}
		return lista;
	}
	
	private void numerosImparesPreAux (GeneralTree <Integer> a, Integer n, List<Integer> lista ) {
		if(a.getData() % 2 != 0 && a.getData()>n) {
			lista.add(a.getData());
		}
		for (GeneralTree<Integer> child : a.getChildren()) {
			numerosImparesPreAux(child,n,lista);
		}
	}
	
	//retorna numeros impares mayores a un valor con recorrido In-Orden
	public List <Integer> numerosImparesMayoresQueInOrden(GeneralTree<Integer> a, Integer n){
		List <Integer> lista= new LinkedList<>();
		if(!a.isEmpty()) {
			this.numerosImparesInAux(a, n, lista);
		}
		return lista;
	}
	
	private void numerosImparesInAux (GeneralTree<Integer> a,Integer n, List <Integer> lista) {
		if(a.hasChildren()) {
			numerosImparesInAux(a.getChildren().get(0),n, lista);
		}
		List <GeneralTree<Integer>> child= a.getChildren();
		if(a.getData() % 2 != 0 && a.getData()>n) {
			lista.add(a.getData());
		}
		for(int i=1; i<child.size();i++) {
			numerosImparesInAux(child.get(i),n, lista);
		}
	}
	
	//retorna numeros impares y mayores a un valor con recorrido Post-Orden
	public List<Integer> numerosImparesMayoresQuePostOrden(GeneralTree<Integer> a, Integer n){
		List<Integer> lista= new LinkedList<>();
		if(!a.isEmpty()) {
			this.numerosImparesPostAux(a,n,lista);
		}
		return lista;
	}
	
	private void numerosImparesPostAux(GeneralTree<Integer> a, Integer n, List<Integer> lista) {
		for(GeneralTree <Integer> child : a.getChildren()) {
			numerosImparesPostAux(child, n, lista);
		}
		if(a.getData() % 2 !=0 && a.getData()>n) {
			lista.add(a.getData());
		}
	}
	
	//retorna numeros impares y mayores a un valor con recorrido por niveles
	public List<Integer> numerosImparesMayoresQueNiveles(GeneralTree<Integer> a, Integer n){
		List <Integer> lista= new LinkedList<Integer>();
		GeneralTree<Integer> aux;
		Queue<GeneralTree<Integer>> cola= new Queue <GeneralTree<Integer>>();
		cola.enqueue(a);
		while(!cola.isEmpty()) {
			aux=cola.dequeue();
			if(aux.getData() % 2 != 0 && aux.getData()>n) {
				lista.add(aux.getData());
			}
			for(GeneralTree<Integer> child : aux.getChildren()) {
				cola.enqueue(child);
			}
		}
		return lista;
	}
}
