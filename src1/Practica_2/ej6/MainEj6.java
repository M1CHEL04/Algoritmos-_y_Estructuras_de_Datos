package Practica_2.ej6;
import Practica_2.BinaryTree;
import Practica_2.Tools;
import java.util.Scanner;
public class MainEj6 {
	public static void main(String[] args) {
		Tools tool = new Tools();
		Scanner scanner = new Scanner (System.in);
		Transformacion ab = new Transformacion ();
		
		//cargo el arbol con los datos
		System.out.println("Ingrese el numero para agregar al arbol");
		int aux= scanner.nextInt();
		while(aux != 0 ) {
			tool.insertarPorNivel(ab.arbol, aux);
			System.out.println("Ingre el numero para agregar al arbol");
			aux= scanner.nextInt();
		}
		
		//imprimo el arbol
		System.out.println("El arbol es: ");
		tool.print_niveles(ab.arbol);
		
		//creo un arbol para poder transformarlo
		BinaryTree <Integer> arbolTransformado = new BinaryTree <Integer>();
		arbolTransformado= ab.suma();
		
		//imprimo el arbol transformado
		System.out.println("El arbol transformado es ");
		tool.print_niveles(arbolTransformado);
		
		scanner.close();
		
		//Ver en la practica porque esta mal, no imprime adecuadamente
	}

}
