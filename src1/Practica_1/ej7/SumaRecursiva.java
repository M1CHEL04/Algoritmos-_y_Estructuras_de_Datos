package Practica_1.ej7;
import java.util.*;
public class SumaRecursiva {
	//creo el metodo para sumar
	public int sumarLinkedList (LinkedList <Integer> lista, int index) {
		if(! (index < lista.size())) {
			return 0;
		}
		else {
			return (lista.get(index)+sumarLinkedList(lista,index+1));
		}
	}
	
	//otra forma de hacerlo recursivo
	public static Integer sumarLinkedList (ListIterator <Integer> lista){
	  	if(lista.hasNext()){
	  		return lista.next() + sumarLinkedList (lista);
	  	}
	  	else{
	  		return 0;
	  	}
	  }
	  
	  //esta funcion cuando se invoca tiene que invocarse con una lista iteradora lista.iterator
	 
}
