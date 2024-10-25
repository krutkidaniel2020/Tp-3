/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public abstract class Cake {
       
    public final void makeCake() {
        prepareIngredients();
        bake();
        decorateCake();
        packageCake();
    }

    
    protected abstract void prepareIngredients();

    
    protected void bake() {
        System.out.println("Cocinando el pastel...");
    }

   
    protected abstract void decorateCake();

   
    protected void packageCake() {
        System.out.println("Empaquetando el pastel...\n");
    }
}
