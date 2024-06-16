package Practica_1.ej3;
public class Profesor {
    String nombre;
    String apellido;
    String eMail;
    String catedra;
    String facultad;
    
    //constructor
    public Profesor (){
        
    }
    
    public Profesor (String nombre, String apellido, String eMail, String catedra, String facultad){
        this.setApellido(apellido);
        this.setNombre(nombre);
        this.setFacultad(facultad);
        this.setCatedra(catedra);
        this.seteMail(eMail);
    }
    
    //getter y setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String geteMail() {
        return eMail;
    }
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    public String getCatedra() {
        return catedra;
    }
    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }
    public String getFacultad() {
        return facultad;
    }
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    //ToString
    public String tuDatos (){
        return("Apellido y nombre: "+this.getApellido()+", "+this.getNombre()+". Facultad: "+this.getFacultad());
    }
}
