/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package patrones.modelo;

/**
 * Interface que representa a nuevas funciones del reproductor
 * @author Grupo G
 */
public interface MusicPlayer {

    
 /**
 * Metodo para obtener nombre de archivo
 * @return nombre del archivo
 */
    public String  getfileName();

 /**
 * Metodo para reproducir una cancion
 * @param fileName nombre de la cancion
 * @return ejecucion del archivo
 * @deprecated Metodo en desuso?
 * @see patrones.modelo.ThirdPartyAudioPlayer startAudio(file)
 */
    public String playSong(String fileName); 
  

}
