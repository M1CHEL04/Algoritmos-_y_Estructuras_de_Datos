package Practica_3.ej11;
import Practica_3.GeneralTree;
import Practica_3.Tools;
public class MainEj11 {
	public static void main(String[] args) {
		Tools <Integer> tools = new Tools <Integer>();
		GeneralTree<Integer> arbol = new GeneralTree<Integer>();
		
		//creo el arbol
		arbol.setData(2);
		arbol.addChild(new GeneralTree<Integer> (1));
		arbol.addChild(new GeneralTree <Integer> (25));
		arbol.getChildren().get(0).addChild(new GeneralTree<Integer> (5));
		arbol.getChildren().get(0).addChild(new GeneralTree<Integer> (4));
		arbol.getChildren().get(1).addChild(new GeneralTree<Integer> (13));
		
		//imprimo el arbol por niveles
		System.out.println("Imprimo el arbol por niveles");
		tools.print_niveles(arbol);
		
		//realizo lo pedido por el enunciado
		if(ParcialArbolesEj11.resolver(arbol)) {
			System.out.println("El arbol es creciente");
		}
		else {
			System.out.println("El arbol no es creciete");
		}
	}

}
