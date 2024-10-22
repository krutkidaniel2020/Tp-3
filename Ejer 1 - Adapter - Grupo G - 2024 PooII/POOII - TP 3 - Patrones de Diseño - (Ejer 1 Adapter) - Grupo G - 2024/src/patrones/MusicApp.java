/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patrones;


import patrones.modelo.MusicPlayer;
import patrones.modelo.TPAPaMPAdaptador;
import patrones.modelo.ThirdPartyAudioPlayer;

/**
 * Clase principal de la aplicación
 *
 * @version 1.0
 * @author Grupo G
 */
public class MusicApp {


    /**
     * Método principal de la aplicación
     *
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {

        ThirdPartyAudioPlayer thirdP = new ThirdPartyAudioPlayer();
        TPAPaMPAdaptador unAdap = new TPAPaMPAdaptador(thirdP);
        System.out.println(unAdap.playSong("Archivo1.mp3"));
        System.out.println(thirdP.startAudio("Archivo2.mp3"));

    }

}
