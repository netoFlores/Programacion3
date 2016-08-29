
package programacion3.interfaces;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author itachi
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese la Altura: ");
        int y = in.nextInt();
        System.out.println("Ingrese base: ");
        int x = in.nextInt();
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.x = x;
        cuadrado.y = y;
        System.out.println(cuadrado.area());
        
        Circulo circulo = new Circulo();
        circulo.radio = 30;
        System.out.println(circulo.area());
        Circulo circulo2 = new Circulo();
        circulo2.radio = 303;
        Circulo[] circuloArray = new Circulo[2];
        circuloArray[0] = circulo2;
        
        ArrayList<Circulo> listaDeCirculo = new ArrayList<>(0);
        listaDeCirculo.add(circulo);
        listaDeCirculo.add(circulo2);
        
        for (Circulo a : listaDeCirculo){
            System.out.println(a.area());
        }
    }
}
