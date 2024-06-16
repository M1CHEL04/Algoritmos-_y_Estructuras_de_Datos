package Practica_1.ej7;
import java.util.*;
public class EjercicioSucecion {
    private List <Integer> lista= new ArrayList <Integer>();
    
    public List <Integer> calcularSucesion (int n){
        if(n == 1){
            this.lista.add(n);
            return lista;
        }
        else{
            this.lista.add(n);
            if(n % 2 == 0){
                return calcularSucesion(n/2);
            }
            else{
                return calcularSucesion((3*n)+1);
            }
        }
    }
    
    public void invertirArrayList (List <Integer> lista){
        
    }
    
    public String toString (List <Integer> lista){
        String aux="";
        for (int i:lista) {
            aux= aux+ " "+ i;
        }
        return aux;
    }
}
