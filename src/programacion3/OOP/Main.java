
package programacion3.OOP;

/**
 *
 * @author itachi
 */
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setAnnion(2016);
        carro.setMarca("Ferrary");
        carro.setModelo("UGB");
        carro.setColor("Rojo");
        
        Carro carro2 = new Carro("Rosado", "Mazda", "RX", 2017);
        
        System.out.println("Carro 1:");
        System.out.println("\tColor: " + carro.getColor() );
        System.out.println("\tMarca: " + carro.getMarca());
        System.out.println("\tModelo: " + carro.getModelo());
        System.out.println("\tAño: " + carro.getAnnion());
        carro.encender();
        carro.acceledar();
        carro.frenar();
        carro.apagar();
        
        System.out.println("Carro 2:");
        System.out.println("\tColor: " + carro2.getColor() );
        System.out.println("\tMarca: " + carro2.getMarca());
        System.out.println("\tModelo: " + carro2.getModelo());
        System.out.println("\tAño: " + carro2.getAnnion());
    }
    
    
}
