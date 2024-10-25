
package Modelo;

/**
 * Clase que representa al Archivo File
 *
 * @author Grupo G
 * @version 1.0
 */
public class File extends FileSystemComponent{
 /**
     * tamaño del archivo
     */
    int tamaño;
 /**
     * Constructor vacio de la clase file
     */
    public File() {
    }
/**
     * Constructor de la clase
     *
     * @params nombre del archivo, que le pide a la clase FileSystemComponent
     * @params tamaño del archivo
     */
    public File(String nombre, int tamaño) {
       super(nombre);
        this.tamaño = tamaño;
    }


 /**
     * Obtiene el tamaño del archivo
     * @return tamaño del archivo
     */
    public int getTamaño() {
        return tamaño;
    }

 /**
     * Establece el tamaño del archivo
     * @param  tamaño del archivo
     */
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    /**
     * Metodo para mostrar los detalles de un archivo
     */
    @Override
    public void showDetails() {
        System.out.println("Archivo: " + nombre + " (Tamaño: " + tamaño + " bytes)");
    }
    
}
