package Practica_1.ej7;
import java.util.*;
public class PuntoI {
	public static void main(String[] args) {
		LinkedList <Integer> lista= new LinkedList <Integer>();
		SumaRecursiva sumador = new SumaRecursiva ();
		//creo la lista
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		System.out.println("La sumatoria de todos los elementos de la lista es: "+sumador.sumarLinkedList(lista, 0));
	}
}
