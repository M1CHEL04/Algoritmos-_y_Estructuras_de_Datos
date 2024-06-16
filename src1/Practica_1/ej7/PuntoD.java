package Practica_1.ej7;
import java.util.*;
public class PuntoD {
    public static void main(String[] args) {
         List <Estudiante> listaEstudiantes= new ArrayList <Estudiante>();
         Estudiante e1,e2,e3;
         e1= new Estudiante ("Luciano Mirenda","9908","Analista y Programador");
         e2= new Estudiante ("Santaigo Michel","1212","Licenciatura Informatica");
         e3= new Estudiante ("Pedro Pedro","1313","Ingenieria en Computacion");
         //agrego objetos a la lista inicial
         listaEstudiantes.add(e1);
         listaEstudiantes.add(e2);
         listaEstudiantes.add(e3);
         List <Estudiante> listaEstudiantesCopia= new ArrayList <Estudiante>();
         //copio la lista inicial en la lista "ListaEstudiantesCopia"
         listaEstudiantesCopia.addAll(listaEstudiantes);
         //Imprimo la lista Original
         System.out.println("Lista Original:");
         for(Estudiante aux:listaEstudiantes){
             System.out.println("Nombre y Apellido: "+aux.getNya()+". Carrera: "+aux.getCarrera());
         }
         //imprimo la lista copia
         System.out.println("Lista Copia:");
         for (Estudiante aux: listaEstudiantesCopia) {
             System.out.println("Nombre y Apellido: "+aux.getNya()+". Carrera: "+aux.getCarrera());
        }
        //Modifico datos de los estudiantes de la lista original;
        for (Estudiante aux : listaEstudiantes) {
            aux.setCarrera("Licenciatura en Sistemas");
        }
        //Impirmo la lista Original
        System.out.println("Lista Original:");
         for(Estudiante aux:listaEstudiantes){
             System.out.println("Nombre y Apellido: "+aux.getNya()+". Carrera: "+aux.getCarrera());
         }
         //Imprimo la lista Copia
         System.out.println("Lista Copia:");
         for (Estudiante aux: listaEstudiantesCopia) {
             System.out.println("Nombre y Apellido: "+aux.getNya()+". Carrera: "+aux.getCarrera());
        }
        //agrego upn nuevo estudiante a lista si es que no esta agregado
        Estudiante e4= new Estudiante ("Santaigo Michel","1212","Licenciatura en Sistemas");
        if(listaEstudiantes.contains(e4)){
            System.out.println("El estudiante ya esta cargado en la lista");
        }
        else{
            listaEstudiantes.add(e4);
        }
    }
}
