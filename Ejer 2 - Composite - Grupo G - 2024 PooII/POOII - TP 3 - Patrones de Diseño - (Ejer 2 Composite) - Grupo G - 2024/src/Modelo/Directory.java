
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa al directorio
 *
 * @author Grupo G
 * @version 1.0
 */
public class Directory extends FileSystemComponent {

    /**
     * lista de directorios
     */
    private List<FileSystemComponent> lista = new ArrayList<>();

    /**
     * Constructor de la clase
     *
     * @param nombre del directorio, que le pide a la clase FileSystemComponent
     */
    public Directory(String nombre) {

        super(nombre);
    }

    /**
     * Metodo para agregar un directorio de la lista
     *
     * @param direc nombre del directorio a agregar
     */
    public void addComponent(FileSystemComponent direc) {
        lista.add(direc);
    }

    /**
     * Metodo para eliminar un directorio de la lista
     *
     * @param direc nombre del directorio a borrar
     */
    public void removeComponent(FileSystemComponent direc) {
        lista.remove(direc);
    }

    /**
     * Metodo para mostrar la lista de los dir con sus nombres
     */
    @Override
    public void showDetails() {
        System.out.println("Directorio: " + nombre);
        for (FileSystemComponent lis : lista) {
            lis.showDetails();
        }
    }

}
