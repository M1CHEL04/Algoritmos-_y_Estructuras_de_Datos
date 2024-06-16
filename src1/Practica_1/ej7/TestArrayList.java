package Practica_1.ej7;
import java.util.*;
public class TestArrayList {
	public static void main(String[] args) {
		List <Integer>lista= new ArrayList <Integer> ();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(7);
        lista.add(34);
        for(int aux:lista ){
            System.out.println("El valor es: "+aux);
        }
	}
}
