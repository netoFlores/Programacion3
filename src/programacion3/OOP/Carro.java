
package programacion3.OOP;

/**
 *
 * @author itachi
 */
public class Carro {
    private String color;
    private String marca;
    private String modelo;
    private int annion;
    
    public Carro(){
    }
    
    public  Carro(String color, String marca, String modelo, int annion){
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.annion = annion;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        if(!color.equals(""))
            this.color = color;
        else
            System.out.println("El campo no debe de quedar en blanco");
    }
    
    public int getAnnion(){
        return this.annion;
    }
    
    public void setAnnion(int annion){
        this.annion = annion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void encender(){
        System.out.println("El carro esta encendido");
    }
    
    public void apagar(){
        System.out.println("El carro se apago");
    }
    
    public void acceledar(){
        System.out.println("Acceledar");
    }
    
    public void frenar(){
        System.out.println("Frenar");
    }
}

