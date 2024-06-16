package Practica_3.ej5;
import Practica_3.Tools;
import Practica_3.GeneralTree;
public class MainEj5 {
	public static void main(String[] args) {
		GeneralTree<Integer> arbol= new GeneralTree<Integer>();
		Tools <Integer> tool = new Tools<Integer> ();
		
		//seteo el arbol;
		arbol.setData(1);
        arbol.addChild(new GeneralTree<>(5));
        arbol.addChild(new GeneralTree<>(7));
        arbol.addChild(new GeneralTree<>(8));
        arbol.getChildren().get(0).addChild(new GeneralTree<>(3));
        arbol.getChildren().get(0).addChild(new GeneralTree<>(9));
        arbol.getChildren().get(0).getChildren().get(1).addChild(new GeneralTree<>(11));
        arbol.getChildren().get(0).getChildren().get(1).getChildren().get(0).addChild(new GeneralTree<>(23));
        
        //imprimo el arbol
        System.out.println("El arbol creado es el siguiente (Impreso por niveles):");
        tool.print_niveles(arbol);
        
        //realizo con lo pedido por el enunciado
        boolean aux=arbol.esAncestro(1, 3);
        if(aux) {
        	System.out.println("Es ancestro");
        }
        else {
        	System.out.println("No es ancestro");
        }
	}

}
