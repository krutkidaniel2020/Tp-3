
import Modelo.Cake;
import Modelo.ChocolateCake;
import Modelo.VainillaCake;

/**
 * Clase que representa la app principal del sistema
 * @author Grupo G POO II 2024
 * @version 1.0
 */
public class Principal {

  /**
     * Método principal de la aplicación
     *
     * @param args Argumentos de la línea de comandos
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
