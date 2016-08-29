
package programacion3.oop2;

/**
 *
 * @author itachi
 */
public abstract class Figuras {
    public int x, y;
    
    public Figuras(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public abstract double area();

    @Override
    public String toString() {
        return "Figuras{" + "x=" + x + ", y=" + y + '}';
    }
    
    
            
}
