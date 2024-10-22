/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Daniel K
 */
public class File {
    String nombre;
    byte tamaño;

    public File() {
    }

    public File(String nombre, byte tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public byte getTamaño() {
        return tamaño;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamaño(byte tamaño) {
        this.tamaño = tamaño;
    }
    
    
    
}
