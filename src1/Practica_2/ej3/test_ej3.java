package Practica_2.ej3;
//import Practica_2.BinaryTree;
import java.util.*;

import Practica_2.Tools;
public class test_ej3 {
	public static void main(String[] args) {
		Tools tool = new Tools ();
		//creo un arbol 
		ContadorArbol arbol = new ContadorArbol (10);
		//cargo el arbol con datos
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingrese un numero");
		int num = scanner.nextInt();
		while(num != 0) {
			tool.insertarPorNivel(arbol.ab, num);
			System.out.println("Ingrese un numero");
			num= scanner.nextInt();
		}
		//creo la lista para retornar los numeros pares:
		ArrayList <Integer> listaPares= new ArrayList <Integer>();
		//hago lo pedido por el enunciado
		listaPares= arbol.numeroParesInOrden();
		//imprimo la lista
		for (int i : listaPares) {
			System.out.println ("El numero almacenado en la lista es: "+i);
		}
		
		scanner.close();
	}

}
