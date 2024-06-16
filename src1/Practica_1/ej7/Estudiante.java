package Practica_1.ej7;
public class Estudiante {
    String nya;
    String nAlumno;
    String carrera;
    
    //constructor
    public Estudiante (){
    	
    }
    public Estudiante(String nya, String nAlumno, String carrera) {
        this.nya = nya;
        this.nAlumno = nAlumno;
        this.carrera = carrera;
    }

    //getters y setters
    public String getNya() {
        return nya;
    }

    public void setNya(String nya) {
        this.nya = nya;
    }

    public String getnAlumno() {
        return nAlumno;
    }

    public void setnAlumno(String nAlumno) {
        this.nAlumno = nAlumno;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    @Override
    public boolean equals (Object o){
        boolean aux;
        if(o==null){
            aux=false;
        }
        if(!(o instanceof Estudiante)){
            aux=false;
        }
        Estudiante auxEs= (Estudiante) o;
        aux= this.getNya().equals(auxEs.getNya())&& (this.getCarrera().equals(auxEs.getCarrera())) && (this.getnAlumno().equals(auxEs.getnAlumno()));
        return aux;
    }
    
}
