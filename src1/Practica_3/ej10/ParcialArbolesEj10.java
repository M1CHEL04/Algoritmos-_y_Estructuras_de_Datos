package Practica_3.ej10;
import Practica_3.GeneralTree;
import java.util.*;

public class ParcialArbolesEj10 {
	
	private static class Valor {
		int max;
		
		Valor(){
			max=-1;
		}
	}
	
	public static List <Integer> resolver (GeneralTree <Integer> arbol){
		List <Integer> lista = new LinkedList <Integer>();
		List <Integer> listaMax= new LinkedList <Integer>();
		Valor maximo = new Valor();
		if(arbol == null || arbol.isEmpty()) {
			return listaMax;
		}
		else {
			recorridoMaxPrivado(arbol, lista, listaMax, 0, 0, maximo);
			return listaMax;
		}
	}
	
	private static void recorridoMaxPrivado(GeneralTree<Integer> arbol, List<Integer> lista, List<Integer>listaMax, Integer calculo, Integer nivel, Valor maximo) {
		if(arbol.getData() == 1) {
			calculo+= nivel * 1;
			lista.add(arbol.getData());
		}
		
		if(arbol.isLeaf()) {
			if(maximo.max < calculo) {
				maximo.max=calculo;
				listaMax.clear();
				listaMax.addAll(lista);
			}
		}
		
		else {
			for (GeneralTree <Integer> child : arbol.getChildren()) {
				recorridoMaxPrivado(child,lista,listaMax,calculo,nivel+1,maximo);
			}
		}
		
		if(arbol.getData() == 1) {
			lista.remove(lista.size()-1);
		}
	}
}
