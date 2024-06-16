package Practica_3.ej6;
import Practica_3.GeneralTree;
import Practica_3.Tools;
public class MainEj6 {

	public static void main(String[] args) {
		Tools <Character> tools= new Tools <Character>();
		//genero el arbol
		GeneralTree<Character> arbol = new GeneralTree<Character>();
		arbol.setData('A');
		arbol.addChild(new GeneralTree<Character> ('B'));
		arbol.addChild(new GeneralTree<Character> ('C'));
		arbol.addChild(new GeneralTree<Character> ('D'));
		arbol.addChild(new GeneralTree<Character> ('E'));
		arbol.getChildren().get(0).addChild(new GeneralTree <Character>('F'));
		arbol.getChildren().get(0).addChild(new GeneralTree <Character>('G'));
		arbol.getChildren().get(1).addChild(new GeneralTree <Character>('H'));
		arbol.getChildren().get(1).addChild(new GeneralTree <Character>('I'));
		arbol.getChildren().get(2).addChild(new GeneralTree <Character>('J'));
		arbol.getChildren().get(2).addChild(new GeneralTree <Character>('K'));
		arbol.getChildren().get(0).getChildren().get(0).addChild(new GeneralTree<Character> ('L'));
		arbol.getChildren().get(0).getChildren().get(0).addChild(new GeneralTree<Character> ('M'));
		
		//imprimo el arbol generado por niveles
		System.out.println("Imprimo el arbol generado por niveles");
		tools.print_niveles(arbol);
		
		//realizo lo pedido por el inciso 6
		RedDeAguaPotable aux = new RedDeAguaPotable (arbol);
		
		System.out.println("El caudal minimo que recibe cada casa es: "+ aux.minimoCaudal(10000));
			
	}

}
