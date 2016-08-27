/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion3.OOP;

/**
 *
 * @author itachi
 */
public class Main2 {
    public static void main(String[] args) {
        CarroCedan cedan = new CarroCedan();
        cedan.encender(true);
        if(cedan.encenderLuces(false))
            System.out.println("luces Encendida");
        else
            System.out.println("Luces apagadas");
        
        
        
        
        
        
    }
}
