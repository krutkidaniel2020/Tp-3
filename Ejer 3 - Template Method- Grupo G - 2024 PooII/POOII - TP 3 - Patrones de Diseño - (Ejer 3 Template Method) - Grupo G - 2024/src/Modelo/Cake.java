/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * Clase abstracta Cake - Principal
 * @author Grupo G POOII 2024
 * @version 1.0
 */
public abstract class Cake {
       
    /**
     * Metodo de tipo final para llamar demas metodos
     *
     */
    public final void makeCake() {
        prepareIngredients();
        bake();
        decorateCake();
        packageCake();
    }

    /**
     * Metodo de tipo abstract Preparar ingredientes
     *
     */
    protected abstract void prepareIngredients();

      /**
     * Metodo para cocinar pastel
     *
     */
    protected void bake() {
        System.out.println("Cocinando el pastel...");
    }

   /**
     * Metodo de tipo abstract decorar 
     *
     */
    protected abstract void decorateCake();

       /**
     * Metodo para empaquetar pastel
     *
     */
    protected void packageCake() {
        System.out.println("Empaquetando el pastel...\n");
    }
}
