package Practica_3.ej9;
import Practica_3.GeneralTree;
import Practica_3.Tools;
public class MainEj9 {
	public static void main(String[] args) {
		Tools<Integer> tools = new Tools <Integer>();
		GeneralTree<Integer> arbol= new GeneralTree<Integer>();
		
		//cargo el arbol
		arbol.setData(10);
		arbol.addChild(new GeneralTree<Integer> (10));
		arbol.addChild(new GeneralTree<Integer> (35));
		arbol.addChild(new GeneralTree<Integer> (40));
		arbol.getChildren().get(1).addChild(new GeneralTree<Integer> (35));
		arbol.getChildren().get(1).addChild(new GeneralTree<Integer> (80));
		arbol.getChildren().get(2).addChild(new GeneralTree<Integer> (40));
		
		//imprimo el arbol
		System.out.println("El arbol es el siguiente");
		tools.print_niveles(arbol);
		
		//realizo lo pedido por el enunciado
		if(ParcialArbolesEj9.esDeSeleccion(arbol)) {
			System.out.println("El arbol es de seleccion");
		}
		else {
			System.out.println("El arbol no es de seleccion");
		}
	}

}
