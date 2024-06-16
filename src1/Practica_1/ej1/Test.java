package Practica_1.ej1;
public class Test {
    public static void main(String[] args) {
    	System.out.print("For| La suma entre los numeros 2 y 4 es: ");
    	System.out.println(SumadorEntreDos.calcularValorEntreDosFor(2, 4));
    	System.out.print("While| La suma de los numeros entre 2 y 4 es: ");
        System.out.println(SumadorEntreDos.calcularValoresEntreDosWhile(2, 4));
        System.out.println("Sin iterar| La suma de los numeros entre 2 y 4 es: ");
        System.out.println(SumadorEntreDos.calcularValoresEntreDos(2, 4));
    }
    
}
