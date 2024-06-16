package Practica_3.ej10;
import Practica_3.GeneralTree;
import Practica_3.Tools;
public class MainEj10 {
	public static void main(String[] args) {
		GeneralTree<Integer> arbol = new GeneralTree<Integer> ();
		Tools <Integer> tools = new Tools <Integer> ();
		//creo el arbol
		
		arbol.setData(1);
		arbol.addChild(new GeneralTree <Integer> (0));
		arbol.addChild(new GeneralTree <Integer> (1));
		arbol.addChild(new GeneralTree <Integer> (1));
		arbol.getChildren().get(0).addChild(new GeneralTree<Integer> (1));
		arbol.getChildren().get(0).addChild(new GeneralTree<Integer> (1));
		arbol.getChildren().get(0).getChildren().get(0).addChild(new GeneralTree<Integer> (1));
		arbol.getChildren().get(1).addChild(new GeneralTree<Integer> (1));
		arbol.getChildren().get(1).addChild(new GeneralTree <Integer> (0));;
		arbol.getChildren().get(1).getChildren().get(1).addChild(new GeneralTree <Integer> (0));
		arbol.getChildren().get(1).getChildren().get(1).getChildren().get(0).addChild(new GeneralTree <Integer> (1));
		arbol.getChildren().get(2).addChild(new GeneralTree <Integer> (0));
		arbol.getChildren().get(2).getChildren().get(0).addChild(new GeneralTree <Integer> (0));
		arbol.getChildren().get(2).getChildren().get(0).getChildren().get(0).addChild(new GeneralTree <Integer> (0));
		arbol.getChildren().get(2).getChildren().get(0).getChildren().get(0).addChild(new GeneralTree <Integer> (0));

		//imprimo el arbol
		System.out.println("Imprimo el arbol por niveles");
		tools.print_niveles(arbol);
		
		//realizo lo pedido por el ejercicio
		System.out.println("La lista maxima es: ");
		
		System.out.println(ParcialArbolesEj10.resolver(arbol));
	}

}
