package Practica_1.ej7;
import java.util.*;
public class PuntoJ {
	public static void main(String[] args) {
		UnirListas aux= new UnirListas ();
		ArrayList <Integer> lista1= new ArrayList <Integer>();
		ArrayList <Integer> lista2= new ArrayList <Integer>();
		//ArrayList <Integer> nuevoLista= new ArrayList <Integer>();
		//agrego elementos lista1
		lista1.add(1);
		lista1.add(2);
		lista1.add(3);
		//agrego elementos lista2
		lista2.add(4);
		lista2.add(5);
		lista2.add(6);
		//imprimo la lista 1
		System.out.println("Lista 1:");
		for(int i : lista1) {
			System.out.print(i);
		}
		//imprimo lista 2
		System.out.println("\nLista 2:");
		for(int i : lista2) {
			System.out.print(i);
		}
		//imprimo las listas unidas
		System.out.println("\nLista unificada");
		for(int i: aux.combinadorOrdenado(lista1, lista2)) {
			System.out.print(i);
		}
	}
}
