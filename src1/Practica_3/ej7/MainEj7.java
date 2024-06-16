package Practica_3.ej7;
import Practica_3.GeneralTree;
import Practica_3.Tools;
public class MainEj7 {
	public static void main(String[] args) {
		GeneralTree<Integer> arbol = new GeneralTree<Integer>();
		Tools <Integer> tools = new Tools <Integer>();
		
		//creo el arbol
		arbol.setData(1);
		arbol.addChild(new GeneralTree<>(5));
		arbol.addChild(new GeneralTree<>(7));
		arbol.addChild(new GeneralTree<>(8));
        arbol.getChildren().get(0).addChild(new GeneralTree<>(3));
        arbol.getChildren().get(0).addChild(new GeneralTree<>(9));
        arbol.getChildren().get(0).getChildren().get(1).addChild(new GeneralTree<>(11));
        arbol.getChildren().get(0).getChildren().get(1).getChildren().get(0).addChild(new GeneralTree<>(23));
        
        //imprimo el arbol
        System.out.println("Imprimo el arbol ingresado por niveles");
        tools.print_niveles(arbol);
        
        //realizo lo pedido por el ejercico
        Caminos aux= new Caminos (arbol);
        if(!aux.caminoAHojaMasLejana().isEmpty()) {
        	System.out.println("El camino mas lejano es:");
        	System.out.println(aux.caminoAHojaMasLejana());
        }
        else {
        	System.out.println("El arbol ingresado esta vacio");
        }
        

	}

}
