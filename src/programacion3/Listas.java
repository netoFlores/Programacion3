
package programacion3;


import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author itachi
 */


public class Listas {
    public static void main(String[] args) {
        
        ArrayList<String> productos = new ArrayList<String>(0);
        
        productos.add("Leche");
        productos.add("Arraz");
        productos.add("Café");
        
        System.out.println(productos.size());
        productos.remove(2);
        System.out.println(productos.size());
        for(String a : productos){
            System.out.println(a);
        }        
                
        ArrayList<ArrayList<String>> a = new ArrayList<ArrayList<String>>();
        
        
    }
}
