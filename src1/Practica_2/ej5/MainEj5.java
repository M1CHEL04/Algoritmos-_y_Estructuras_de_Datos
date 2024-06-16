package Practica_2.ej5;
import Practica_2.Tools;
import java.util.Scanner;
public class MainEj5 {

	public static void main(String[] args) {
		Tools tool= new Tools();
		ProfundidadDeArbolBinario ab = new ProfundidadDeArbolBinario();
		Scanner scanner = new Scanner (System.in);
		//agrego los elementos
		System.out.println("Ingrese un numero para agregar al arbol");
		int aux= scanner.nextInt();
		while(aux != 0) {
			tool.insertarPorNivel(ab.ab, aux);
			System.out.println("Ingrese un numero para agregar al arbol");
			aux= scanner.nextInt();
		}
		//imprimo el arbol
		tool.print_niveles(ab.ab);
		//retorno la suma de los elementos en el nivel 1
		System.out.println("La suma de los elementos en el nivel 1 es: "+ ab.sumaElementosProfundidad(1));
		scanner.close();
	}

}
