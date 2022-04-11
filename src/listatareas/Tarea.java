
package listatareas;

public class Tarea {
    String nombre;
    String descripcion;
    
        //Constructor
    public Tarea(String nombre,String descripcion){
    this.nombre = nombre;
    this.descripcion = descripcion;
    }
        //Metodo
    public void Mostrar(){
    System.out.println("Nombre: "+this.nombre+" Descripcion: "+this.descripcion);
    }

}


