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
public class VainillaCake extends Cake{
    
    protected void prepareIngredients() {
        System.out.println("Preparando  pastel de vainilla...");
    }

    
    protected void decorateCake() {
        System.out.println("Decorando vainilla con crema batida.");
    }
}
