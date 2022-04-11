package listatareas;
import java.util.Scanner;


public class ListaTareas {

    public static void main(String[] args) {
       int respuesta,f,i,pregunta,contador;
       respuesta=1;
       pregunta=0;
       i=0;
       contador=0;
       Scanner Teclado = new Scanner (System.in); 
       System.out.println("¿De que tamaño va a ser su arreglo?");
       f = Teclado.nextInt();
       Teclado.nextLine();
       Tarea [] arreglo_tareas = new Tarea [f];
       do{
            System.out.println("     Lista de Tareas ");
            System.out.println("Ingrese 1 para ingresar las tareas");
            System.out.println("Ingrese 2 para imprimir las tareas");
            System.out.println("Ingrese 3 para salir del programa");
            respuesta = Teclado.nextInt();
            Teclado.nextLine();
            while(respuesta<1 || respuesta>3){
            System.out.println("Error: La opción ingresada no existe");
            System.out.println("Ingrese 1 para ingresar las tareas");
            System.out.println("Ingrese 2 para imprimir las tareas");
            System.out.println("Ingrese 3 para salir del programa");
            respuesta = Teclado.nextInt();
            Teclado.nextLine();
            }
            
            switch(respuesta){
                //Ingresar tareas
                case 1:
                    while(pregunta==0){
                        
                      System.out.println("Ingrese nombre de la tarea N°"+i);
                      String nombre = Teclado.nextLine();
                      System.out.println("Ingrese descripcion de la tarea N°"+i);
                      String descripcion = Teclado.nextLine();
                      arreglo_tareas[i] = new Tarea(nombre,descripcion);
                      i=i+1;
                      contador=contador + 1;
                      System.out.println("¿Desea continuar?");
                      System.out.println("0.Si");
                      System.out.println("1.No");
                      pregunta = Teclado.nextInt();
                      Teclado.nextLine();
                    }
                    break;
                
                //Muestra las tareas
                case 2:
                    for(i=0;i<contador;i++){
                    System.out.println("Tarea N°"+i);
                    arreglo_tareas[i].Mostrar();
                    } 
                    break;
                 } //Fin Switch
        }while (respuesta<3); 
   }
}
