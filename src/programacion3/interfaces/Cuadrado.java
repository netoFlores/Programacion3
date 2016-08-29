
package programacion3.interfaces;



/**
 *
 * @author itachi
 */
public class Cuadrado implements Figuras{
    public int x, y;

    
    @Override
    public double area() {
        return x*y;
    }
    
}
