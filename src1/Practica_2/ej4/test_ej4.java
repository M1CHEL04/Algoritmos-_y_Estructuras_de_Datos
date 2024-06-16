package Practica_2.ej4;
import java.util.*;
import Practica_2.Tools;
public class test_ej4 {

	public static void main(String[] args) {
		Tools tool= new Tools ();
		//creo el objeto
		RedBinariaLlena ab= new RedBinariaLlena ();
		//cargo el arbol del objeto;
		Scanner scanner= new Scanner (System.in);
		int num;
		for (int i= 0 ; i<7; i++) {
			System.out.println("Ingrese un numero");
				num= scanner.nextInt();
				tool.insertarPorNivel(ab.ab, num);
		}
		//Imprimo el arbol
		System.out.println("arbol impreso en orden:");
		tool.print_inOrden(ab.ab);
		
		//Imprimo el resultado
		System.out.println("El resulto es: "+ab.retardoReenvio());
		scanner.close();
	}

}
