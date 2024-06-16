package Practica_1.ej8;
import java.util.*;
public class CircularQueue<T> extends Queue<T> {
	ArrayList <T> data;
	
	//mover todos los elementos de la cola un lugar a la izquierda
	public void shift() {
		if(data.isEmpty()) {
			System.out.println("La cola esta vacia y no se puede aplicar esta funcion");
			return;
		}
		T firstElement = data.get(0);
		for (int i= 0; i<data.size()-1;i++) {
			data.add(i, data.get(i+1));
		}
		data.add(data.size()-1, firstElement);	
	}
}
