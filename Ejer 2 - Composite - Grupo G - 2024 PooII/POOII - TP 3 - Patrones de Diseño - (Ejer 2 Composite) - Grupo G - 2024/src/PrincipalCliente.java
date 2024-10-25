
import Modelo.Directory;
import Modelo.File;
import Modelo.FileSystemComponent;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 * Clase que representa la app principal del sistema
 * @author Daniel K
 * @version 1.0
 */
public class PrincipalCliente {

     /**
     * Método principal de la aplicación
     *
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // Crear archivos  y directorios
        File archivo1 = new File("Arch.txt", 222);
        File archivo2 = new File("Arch2.jpg", 333);
        File archivo3 = new File("Arch3.pdf", 444);
        Directory dir1 = new Directory("Doc1");
        Directory dir2 = new Directory("Doc2");
        Directory dir3 = new Directory("Doc3");
        Directory dir4 = new Directory("Doc4");

        // Añadir archivos a los directorios
        dir1.addComponent(archivo1); 
        dir2.addComponent(archivo2);

        // Añadir subdirectorios y arch
        dir3.addComponent(dir1); 
        dir3.addComponent(dir2); 
        dir3.addComponent(dir4); 
        dir3.addComponent(archivo3); 

        // Mostrar la estructura de archivos y directorios
        dir3.showDetails();
    }
    
}
