package Practica_2.ej1;

import Practica_2.BinaryTree;
import Practica_2.Tools;

public class principal {

	public static void main(String[] args) {
		BinaryTree <Integer> ab= new BinaryTree <Integer> ();
		BinaryTree <Integer> hi= new BinaryTree <Integer> ();
		BinaryTree <Integer> hd= new BinaryTree <Integer> ();
		ab.setData(10);
		hi.setData(25);
		hd.setData(30);
		hi.addLeftChild(new BinaryTree <Integer> (90));
		hd.addRightChild(new BinaryTree <Integer> (50));
		ab.addLeftChild(hi);
		ab.addRightChild(hd);
		//imprimo el arbol
		Tools tool= new Tools ();
		tool.print_niveles(ab);
		System.out.println("La cantidad de hojas que tiene el arbol es: "+ab.contarHojas());
	}

}
