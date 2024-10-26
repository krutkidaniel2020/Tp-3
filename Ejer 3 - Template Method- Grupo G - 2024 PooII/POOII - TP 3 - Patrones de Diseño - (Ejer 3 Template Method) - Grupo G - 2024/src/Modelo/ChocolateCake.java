/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * Clase ChocolateCake que extiende de Cake
 * @author Grupo G POOII 2024
 * @version 1.0
 */
public class ChocolateCake extends Cake{
   /**
     * Metodo para preparar ingredientes chocolate cake
     *
     */
    protected void prepareIngredients() {
        System.out.println("Preparando chocolate cake...");
    }

    /**
     * Metodo para decorar  chocolate cake
     *
     */
    protected void decorateCake() {
        System.out.println("Decorando pastel.");
    }
}
