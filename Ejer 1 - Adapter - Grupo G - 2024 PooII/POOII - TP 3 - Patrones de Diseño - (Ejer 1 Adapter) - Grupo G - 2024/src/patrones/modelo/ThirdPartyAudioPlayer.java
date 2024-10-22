/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones.modelo;

/**
 * Nueva clase de canciones
 * @version 1.0
 * @author Grupo G
 */
public class ThirdPartyAudioPlayer {

    /**
     * Nombre del archivo
     */
    String file;
    /**
     * Constructor en blanco de la clase ThirdPartyAudioPlayer
     */
    public ThirdPartyAudioPlayer() {
    }
    /**
     * Constructor de la clase ThirdPartyAudioPlayer
     * @param file Nombre del archivo
     */
    public ThirdPartyAudioPlayer(String file) {
        this.file = file;
    }

    /**
     * Establece los nombre del archivo
     * @param file Nombres del empleado
     */
    public void setFile(String file) {
        this.file = file;
    }
    
    /**
     * Obtiene el nombre del archivo
     * @return Nombre del archivo
     */
    public String getFile() {
        return file;
    }

    /**
     * Metodo nuevo para reproducir
     * @param file nombre del archivo
     * @return texto de la ejec del archivo
     */
    public String startAudio(String file) {
        return "Retornando file desde la clase ThirdPartyAudioPlayer Metodo nuevo: " + file;
    }

}
