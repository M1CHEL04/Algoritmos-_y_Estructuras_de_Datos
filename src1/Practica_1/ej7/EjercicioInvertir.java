package Practica_1.ej7;
import java.util.*;
public class EjercicioInvertir {
	//creo el procedimiento 
	public void invertirArrayList (ArrayList <Integer>lista, int posI, int posJ) {
			if(posI>=posJ) {
				return;
			}
			else {
				int aux = lista.get(posJ);
				lista.set(posJ, lista.get(posI));
				lista.set(posI, aux);
				invertirArrayList(lista,posI+1,posJ-1);
			}
	}
}
