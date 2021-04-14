/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

/**
 *
 * @author Fernado
 */
public class CarroComun extends Carro {
    
    public CarroComun(){
    super();
    System.out.println("Creando Carro comun...");
    
    }

    @Override
    public void encender() {
         System.out.println("Encendiendo Carro comun...");
   }

    @Override
    public void acelearar() {
       System.out.println("Acelerando Carro comun...");
    }

    @Override
    public void apagar() {
     System.out.println("Apangando Carro comun...");
     }

    
}
