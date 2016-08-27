
package programacion3.OOP;

/**
 *
 * @author itachi
 */
public class CarroCedan extends Carro {
    private int puerta; 
    
    public CarroCedan(){
    }

    public CarroCedan(int puerta, String color, String marca, String modelo, int annion) {
        super(color, marca, modelo, annion);
        this.puerta = puerta;
    }

    public int getPuerta() {
        return puerta;
    }

    public void setPuerta(int puerta) {
        this.puerta = puerta;
    }
    
    public boolean encenderLuces(boolean orden){
        return orden;
    }
    
    
    //Sobreescritura
    
    @Override
    public void encender(){
        System.out.println("El carro cedan esta encendido");
    }
    
   
    public boolean encender(boolean a){
        System.out.println("Otro tipo de encendido");
        return a;
    }
}