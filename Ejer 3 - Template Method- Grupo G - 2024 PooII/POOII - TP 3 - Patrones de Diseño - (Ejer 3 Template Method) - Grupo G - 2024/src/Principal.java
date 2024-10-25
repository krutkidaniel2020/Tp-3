
import Modelo.Cake;
import Modelo.ChocolateCake;
import Modelo.VainillaCake;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cake chocolateCake = new ChocolateCake();
        Cake vanillaCake = new VainillaCake();

        System.out.println("Haciendo pastel de chocolate:");
        chocolateCake.makeCake();

        System.out.println("Haciendo pastel de vainilla:");
        vanillaCake.makeCake();
    }
    
}
