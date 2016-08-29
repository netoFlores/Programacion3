
package programacion3.oop2;

/**
 *
 * @author itachi
 */
public class Main {
    public static void main(String[] args) {
        Circulo figura = new Circulo(10, 10);
        figura.radio = 30;
        System.out.println(figura.area());
        System.out.println(figura.toString());
        
        Cuadrado cuadrado = new Cuadrado(20, 20);
        System.out.println(cuadrado.area());
    }
}
