/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * Clase VainillaCake que extiende de Cake
 * @author Grupo G POOII 2024
 * @version 1.0
 */
public class VainillaCake extends Cake{
    /**
     * Metodo para Preparar ingredientes
     *
     */
    protected void prepareIngredients() {
        System.out.println("Preparando  pastel de vainilla...");
    }

     /**
     * Metodo para decorar vainilla
     *
     */
    protected void decorateCake() {
        System.out.println("Decorando vainilla.");
    }
}
