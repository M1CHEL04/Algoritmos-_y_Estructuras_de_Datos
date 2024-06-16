package Practica_1.ej7;
import java.util.*;
public class PuntoH {
	public static void main(String[] args) {
		EjercicioInvertir invertirOrden = new EjercicioInvertir();
		ArrayList <Integer> lista= new ArrayList <Integer>();
		//Agrego elementos a la lista
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		//Imprimo la lista antes de invertirla
		System.out.println("Lista antes de ser invertida: ");
		for(int i : lista) {
			System.out.println(i);
		}
		//Invierto la lista
		invertirOrden.invertirArrayList(lista, 0, lista.size()-1);
		System.out.println("Lista invertida: ");
		for(int i : lista) {
			System.out.println(i);
		}
	}
}
