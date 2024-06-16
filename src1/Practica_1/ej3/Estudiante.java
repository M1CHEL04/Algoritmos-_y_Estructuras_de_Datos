package Practica_1.ej3;
public class Estudiante {
    String nombre;
    String apellido;
    String comision;
    String eMail;
    String direccion;
    
    //constructor
    public Estudiante (){
        
    }
    
    public Estudiante (String nombre,String apellido,String comision,String eMail,String direccion){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setComision(comision);
        this.setDireccion(direccion);
        this.seteMail(eMail);
    }
    
    //geterr y setter
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
    public String getComision() {
        return comision;
    }
    public void setComision(String comision) {
        this.comision = comision;
    }
    public String geteMail() {
        return eMail;
    }
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //ToString
    public String tusDatos(){
        return ("Apellido y nombre: "+this.getApellido()+", "+this.getNombre()+", Comision: "+this.getComision());
    }
    
}
