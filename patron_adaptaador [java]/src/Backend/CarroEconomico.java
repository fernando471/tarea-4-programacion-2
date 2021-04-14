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
public class CarroEconomico extends Carro{
    
      public CarroEconomico(){
    super();
    System.out.println("Creando Carro Economico...");
    
    }

    @Override
    public void encender() {
         System.out.println("Encendiendo Carro Economico...");
   }

    @Override
    public void acelearar() {
       System.out.println("Acelerando Carro Economico...");
    }

    @Override
    public void apagar() {
     System.out.println("Apangando Carro Economico...");
     }

   
    
}
