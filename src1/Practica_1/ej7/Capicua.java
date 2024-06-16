package Practica_1.ej7;
import java.util.ArrayList;
import java.util.List;
public class Capicua {
    public static boolean esCapicua(List <Integer> lista){
        boolean aux= true;
        if(lista.size() % 2 != 0){
            aux=false;
        }
        else{
            int i,j;
            i=0;
            j=lista.size()-1;
            while((aux)&&(i<lista.size()/2)){
                if(lista.get(i)!=lista.get(j)){
                    aux=false;
                }
                i++;
                j--;
            }
        }
        return aux;
    }
    
    public static void main(String[] args) {
        List <Integer>listaNum=new ArrayList<Integer> ();
        //agrego los elementos a la lista para que sea capicua
        listaNum.add(1);
        listaNum.add(3);
        listaNum.add(7);
        listaNum.add(1);
        listaNum.add(9);
        if (esCapicua(listaNum)){
            System.out.println("La lista es capicua");
        }
        else{
            System.out.println("La lista no es capicua");
        }
    }
}
