
package programacion3.interfaces;

/**
 *
 * @author itachi
 */
public class Circulo implements Figuras{
    public int radio;
    @Override
    public double area() {
        return Math.PI * (radio * radio);
    }
    
}
