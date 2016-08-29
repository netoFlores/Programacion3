
package programacion3.oop2;

/**
 *
 * @author itachi
 */
public class Cuadrado extends Figuras{

    public Cuadrado(int x, int y) {
        super(x, y);
    }

    @Override
    public double area() {
        return x * y;
    }
    
}
