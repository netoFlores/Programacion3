
package programacion3.oop2;

/**
 *
 * @author itachi
 */
public class Circulo extends Figuras {
    public int radio;
    public Circulo(int x, int y) {
        super(x, y);
    }

    @Override
    public double area() {
        Double r = Math.PI * (radio*radio);
        return r;
    }
    
}
