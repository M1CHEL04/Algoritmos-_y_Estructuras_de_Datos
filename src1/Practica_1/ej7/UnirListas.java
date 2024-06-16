package Practica_1.ej7;
import java.util.*;
public class UnirListas {
	
	public ArrayList<Integer> combinadorOrdenado(ArrayList<Integer> list1,ArrayList<Integer>list2) {

        ArrayList<Integer> nuevaLista = new ArrayList<Integer>();
        int j;

        for (int i = 0 ; i < list1.size(); i++) {
            j = 0;
            //recorrido para el elemento de lista1(i) menor que lista2(i)
            if (list1.get(i) < list2.get(i)) {
            	//avanzo en la lista nueva hasta encontrar un elemento mas grande que lista 1 (i) o finalizar
                while ((j != nuevaLista.size())&&(nuevaLista.get(j) < list1.get(i))){
                    j++;
                }
                if(j == nuevaLista.size()){
                	//salgo por que finalizo la listo
                    nuevaLista.add(j, list1.get(i));
                } 
                else {
                	//salgo en el medio de la lista
                    nuevaLista.add(j,list1.get(i));
                }
                //avanzo en la lista nueva hasta encontrar un elemento mas grande que lista2(i) o finalizar
                while ((j != nuevaLista.size())&&(nuevaLista.get(j) < list2.get(i))){
                    j++;
                }
                if(j == nuevaLista.size()){
                	//salgo por que finalizo la lista
                    nuevaLista.add(j, list2.get(i));
                } else {
                	//salgo en el medio de la lista
                    nuevaLista.add(j,list2.get(i));
                }
              //recorrido para elemento de lista2(i) menor que lista1(i)
            } else{
            	//avanzo en la lista nueva hasta encontrar un elemento mayor que lista2(i) o finalizar
                while ((j != nuevaLista.size())&&(nuevaLista.get(j) < list2.get(i))){
                    j++;
                }
                if(j == nuevaLista.size()){
                	//salgo en el final de la lista
                    nuevaLista.add(j, list2.get(i));
                } else {
                	//salgo en el medio de la lista
                    nuevaLista.add(j,list2.get(i));
                }
                //avanzo en la lista nueva hasta encontrar un elemento mayor que lista1(i) o finalizar
                while ((j != nuevaLista.size())&&(nuevaLista.get(j) < list1.get(i))){
                    j++;
                }
                if(j == nuevaLista.size()){
                	//salgo en el final de la lista
                    nuevaLista.add(j, list1.get(i));
                } else {
                	//salgo en el medio de la lista
                    nuevaLista.add(j,list1.get(i));
                }
            }
        }
        return nuevaLista;
    }
}