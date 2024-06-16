package Practica_3.ej8;
import Practica_3.GeneralTree;
import Practica_3.Tools;
public class MainEj8 {
	public static void main(String[] args) {
		Tools <Integer> tools= new Tools<Integer>();
		GeneralTree<Integer> arbol = new GeneralTree<Integer> ();
		
		//creo el arbol
		arbol.setData(9);
		arbol.addChild(new GeneralTree<Integer> (8));
		arbol.addChild(new GeneralTree<Integer> (1));
		arbol.addChild(new GeneralTree<Integer> (3));
		
		//imprimo el arbol generado
		System.out.println("El arbol ingresado es el siguiente:");
		tools.print_niveles(arbol);
		
		//realizo lo pedido por el inciso
		AbetoNavideno navidad = new AbetoNavideno (arbol);
		
		if(navidad.esAbetoNavidenoAux()) {
			System.out.println("El arbol ingresado es Abeto");
		}
		else {
			System.out.println("El arbol ingresado no es Abeto");
		}
	}

}
