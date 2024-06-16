package Practica_3.ej3;
import Practica_3.GeneralTree;
import Practica_3.Tools;

public class MainEj3 {
	public static void main(String[] args) {
		/*
		 * Esta clase es para probar los metodos realizados en la clase GeneralTree
		 */
		
		Tools <Integer> tool= new Tools <Integer>();
		GeneralTree<Integer> arbol = new GeneralTree<Integer> ();
		
		//pongo los datos en el arbol;
		arbol.setData(1);
        arbol.addChild(new GeneralTree<>(5));
        arbol.addChild(new GeneralTree<>(7));
        arbol.addChild(new GeneralTree<>(8));
        arbol.getChildren().get(0).addChild(new GeneralTree<>(3));
        arbol.getChildren().get(0).addChild(new GeneralTree<>(9));
        arbol.getChildren().get(0).getChildren().get(1).addChild(new GeneralTree<>(11));
        arbol.getChildren().get(0).getChildren().get(1).getChildren().get(0).addChild(new GeneralTree<>(23));
        
        //Imprimo el arbol
        System.out.println("El arbol ingresado es: ");
        tool.print_niveles(arbol);
        System.out.println("------------------------------------------------------\n");
        //calculo la altura del arbol;
        System.out.println("La altura del arbol generado es: "+ arbol.altura()+"\n");
        System.out.println("-------------------------------------------------------\n");
        
        //calculo el nivel de un dato dado almacenado en el arbol;
        System.out.println("El nivel del nodo que almacena al numero 5 es: "+arbol.nivel(5)+"\n");
        System.out.println("---------------------------------------------------------\n");
        
        //calculo cual es el la amplitud del arbol
        System.out.println("La amplitud del arbol es de "+arbol.ancho()+" nodos.");
	}

}
