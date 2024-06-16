package Practica_1.ej3;
public class Test {
    public static void main(String[] args) {
        Estudiante [] vecEstudiantes= new Estudiante [2];
        Profesor [] vecProfesor= new Profesor [3];
        Estudiante e1,e2;
        Profesor p1,p2,p3;
        e1=new Estudiante ();
        e2=new Estudiante();
        p1= new Profesor();
        p2=new Profesor();
        p3=new Profesor();
        
        //estudiante 1
        e1.setNombre("Patricio");
        e1.setApellido("Perez");
        e1.setComision("3B");
        
        //estudiante 2
        e2.setNombre("Santiago");
        e2.setApellido("Michel");
        e2.setComision("1A");
        
        //profesor 1
        p1.setApellido("Rodriguez");
        p1.setNombre("Pablo");
        p1.setFacultad("Exactas");
        
        //profesor 2
        p2.setNombre("Pedro");
        p2.setApellido("Porro");
        p2.setFacultad("Humanidades");
        
        //profesor 3
        p3.setApellido("Awita");
        p3.setNombre("Xhi");
        p3.setFacultad("Economicas");
        
        //agrego al vector de estudiantes
        vecEstudiantes[0]=e1;
        vecEstudiantes[1]=e2;
        
        //agrego al vector de profesores
        vecProfesor[0]=p1;
        vecProfesor[1]=p2;
        vecProfesor[2]=p3;
        
        //imprimo los datso del vector de estudiantes
        System.out.println("La informacion de los estudiantes es la siguiente: ");
        for (int i = 0; i < 2; i++) {
            System.out.println("Estudiante "+(i+1)+":");
            System.out.println(vecEstudiantes[i].tusDatos());
        }
        
        //imprimo los datos del vector de profesores
        System.out.println("La informacion de los profesores es la siguiente: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Profesor "+(i+1)+":");
            System.out.println(vecProfesor[i].tuDatos());
        }
    }
    
}
