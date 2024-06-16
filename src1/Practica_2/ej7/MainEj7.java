package Practica_2.ej7;
import Practica_2.Tools;
import java.util.Scanner;
public class MainEj7 {

	public static void main(String[] args) {
		ParcialArbolesEj7 ab = new ParcialArbolesEj7 ();
		Tools tool= new Tools ();
		Scanner scanner= new Scanner (System.in);
		
		//cargo el arbol
		System.out.println("Ingrese el numero para agregar en el arbol");
		int aux= scanner.nextInt();
		while(aux != 0) {
			tool.insertarPorNivel(ab.arbol, aux);
			System.out.println("Ingrese el numero para agregar en el arbol");
			aux=scanner.nextInt();
		}
		
		//imprimo el arbol cargado por niveles
		tool.print_niveles(ab.arbol);
		
		//ingreso el numero de nodo a buscar sus hijos unicos
		System.out.println("Ingrese el numero de nodo a buscar su cantida de hijos unicos");
		int num= scanner.nextInt();
		
		//realizo lo pedido por el enunciado
		if(ab.isLeftTree(num)) {
			System.out.println("El arbol posee mayor cantidad de hijos unicos en su rama izquierda");
		}
		else {
			System.out.println("El arbol posee mayor cantidad de hijos unicos en su rama derecha");
		}
		scanner.close();
	}

}
