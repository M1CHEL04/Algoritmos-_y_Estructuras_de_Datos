package Practica_1.ej8;
import java.util.*;
public class Queue<T> extends Sequence {
	ArrayList <T>data;
	
	//cosntructor 
	public Queue () {
		this.data=new ArrayList<T>();
	}
	
	//Insetart un dato T a la cola
	public void enqueue (T dato) {
		this.data.add(dato);
	}
	
	//eliminar un dato de la cola
	public T dequeue () {
		T aux;
		aux= data.get(0);
		data.remove(0);
		return (aux);
	}
	
	//reotrno el elemento del frente de la cola
	public T head() {
		return(data.get(0));
	}
	
	//retorno el tamanio de la cola
	@Override
	public int size() {
		return(data.size());
	}
	
	//chequeo si la cola esta vacia
	@Override
	public boolean isEmpty() {
		return data.size()==0;
	}
	
	//toString
	public String toString () {
		String aux="[ ";
		for(T dato : data) {
			aux= aux + dato +", ";
		}
		aux= aux + "]";
		return aux;
	}
}
