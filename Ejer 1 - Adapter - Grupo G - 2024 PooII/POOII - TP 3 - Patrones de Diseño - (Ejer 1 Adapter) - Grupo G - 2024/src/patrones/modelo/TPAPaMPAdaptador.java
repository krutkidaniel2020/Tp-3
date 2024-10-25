/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones.modelo;

/**
 * Clase Adaptador - Implementa los metodos de MusicPlayer en ThirdPartyAudioPlayer
 * @version 1.0
 * @author Grupo G
 */
public class TPAPaMPAdaptador implements MusicPlayer {
      /**
     * atributo ThirdPartyAudioPlayer que representa a una clase a implementar a traves del adaptador
     */
    private ThirdPartyAudioPlayer unT;

     /**
     * Constructor de la clase TPAPaMPAdaptador
     * @param unT clase a implementar
     */
    public TPAPaMPAdaptador(ThirdPartyAudioPlayer unT) {
        this.unT = unT;
    }
    /**
     * Obtiene el nombre del archivo
     * @return nombre del archivo
     */
    @Override
    public String getfileName() {
        return "Retornando de funcion getFileName TPAPaMPAdaptador";
    }

     /**
     * Obtiene Reproduccion de cancion
     * @return texto reproduccion del archivo
     */
    @Override
    public String playSong(String fileName) {
        return "Retornando fileName de clase TPAPaMPAdaptador: " + fileName;
    }
    
    

}
