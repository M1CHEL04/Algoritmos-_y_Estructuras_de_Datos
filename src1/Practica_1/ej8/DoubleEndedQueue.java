package Practica_1.ej8;
import java.util.*;
public class DoubleEndedQueue<T> extends Queue<T> {
	ArrayList <T> data;
	
	//agrego al principio de una cola
	public void enqueueFirst(T dato) {
		data.add(0, dato);
	}
	
}
