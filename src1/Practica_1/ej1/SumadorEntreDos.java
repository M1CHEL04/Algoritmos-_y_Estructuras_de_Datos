package Practica_1.ej1;
public class SumadorEntreDos {
    
    public static int calcularValorEntreDosFor (int a, int b){
        int aux=0;
        for (int i = a; i <= b; i++) {
            aux+=i;
        }
        return aux;
    } 
    public static int calcularValoresEntreDosWhile (int a, int b){
        int aux=0;
        int i;
        if(a<b){
            i=a;
            while ((i>=a) & (i<=b)){
                aux+=i;
            }
        }
        else{
            i=b;
            while ((i>=b)&(i<=a)){
                aux+=b;
            }
        }
        return aux;
    }
    
    public static int calcularValoresEntreDos (int a, int b){
        int aux;
        if(a<=b){
            aux=((b*(b+1)/2)-(a*(a+1)/2));
        }
        else{
            aux=((a*(a+1)/2)-(b*(b+1)/2));
        }
        return aux;
    }
}
