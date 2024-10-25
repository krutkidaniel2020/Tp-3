package Modelo;

/**
 * Clase que representa al FileSystemComponent
 *
 * @author Grupo G
 * @version 1.0
 */
public abstract class FileSystemComponent {

    /**
     * nombre del archivo/carpeta
     */
    String nombre;

    /**
     * Constructor vacio de la clase
     */
    public FileSystemComponent() {
    }

    /**
     * Constructor de la clase
     *
     * @param nombre nombre del archivo/carpeta
     */
    public FileSystemComponent(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece el nombre del archivo/carpeta
     *
     * @param nombre del archivo/carp
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre del archivo/carpeta
     *
     * @return nombre del archivo/carp
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para mostrar los detalles de un archivo/carpeta
     */
    public abstract void showDetails();

}
