package Practica_3.ej2;
import Practica_3.GeneralTree;
import Practica_3.Tools;
public class MainEj2 {
	public static void main(String[] args) {
		Tools <Integer> tool= new Tools <Integer> ();
		RecorridosAG aux = new RecorridosAG();
		GeneralTree <Integer> arbol= new GeneralTree <Integer>();
		
		//creo el arbol
		arbol.setData(1);
        arbol.addChild(new GeneralTree<>(5));
        arbol.addChild(new GeneralTree<>(7));
        arbol.addChild(new GeneralTree<>(8));
        arbol.getChildren().get(0).addChild(new GeneralTree<>(3));
        arbol.getChildren().get(0).addChild(new GeneralTree<>(9));
        arbol.getChildren().get(0).getChildren().get(1).addChild(new GeneralTree<>(11));
        arbol.getChildren().get(0).getChildren().get(1).getChildren().get(0).addChild(new GeneralTree<>(23));
        
        System.out.println("Recorridos y resulatdos en Pre-Orden\n");
        System.out.println("--------------------------------------------------------------------\n");
        
        //imprimo el arbol en pre-orden
        System.out.println("El arbol impreso en Pre-Orden: ");
        tool.print_preOrden(arbol);
        
        //imprimo el resultado de la lista calculado en Pre-Orden
        System.out.println("Resultados del recorrido en Pre-Orden: ");
        System.out.println(aux.numerosImparesMayoresQuePreOrden(arbol, 5));
        
        System.out.println("---------------------------------------------------------------------\n");
        System.out.println("Recorridos y resultados en In-Orden\n");
        System.out.println("----------------------------------------------------------------------\n");
        
        //imprimo el arbol en In_Orden
        System.out.println("El arbol impreso en In-Orden: ");
        tool.print_inOrden(arbol);
        
        //imprimo la lista
        System.out.println("Resultados del recorrido en In-Orden: ");
        System.out.println(aux.numerosImparesMayoresQueInOrden(arbol, 5));
        
        System.out.println("----------------------------------------------------------------------\n");
        System.out.println("Recorridos y resultados en Post-Orden\n");
        System.out.println("-----------------------------------------------------------------------\n");
        
        //imrimo el arbol en Pos-Orden
        System.out.println("El arbol impreso en Post-Orden");
        tool.print_PostOrden(arbol);
        
        //imprimo el resultado de la lista calculado en Post_orden
        System.out.println("Resultados del recorrido en Post-Orden:");
        System.out.println(aux.numerosImparesMayoresQuePostOrden(arbol, 5));
        
        System.out.println("------------------------------------------------------------------------\n");
        System.out.println("Recorridos y resultados por Niveles\n");
        System.out.println("-------------------------------------------------------------------------\n");
        
        //Imprimo el arbol por Niveles
        System.out.println("El arbol impreso por niveles");
        tool.print_niveles(arbol);
        
        //Imprimo el resultado de la lista calculado en niveles
        System.out.println("Resultados del recorrido por niveles");
        System.out.println(aux.numerosImparesMayoresQueNiveles(arbol, 5));
        System.out.println("-----------------------------------------------------------------------------");
	}

}
