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
public class CarroElectrico {
    
    private boolean conectado = false;
            
            public CarroElectrico() {
            System.out.println("Creando Carro electrico...");
            this.conectado = false;
            }
    
    public void conectar() {
    System.out.println("Conectando Carro electrico...");
    this.conectado = true;
    }
    
       
    public void activar() {
        if (this.conectado){
            System.out.println("No se se puede activar porque no esta conectado el Carro electrico. ");
        }else
    System.out.println("Esta Conectando el Carro electrico...");
    }
 
           
    public void movermasrapido() {
        if (this.conectado){
            System.out.println("No se se puede mover mas rapido porque no esta conectado el Carro electrico. ");
        }else
    System.out.println("Aumentado voltaje de el Carro electrico... moviendose mas rapido...");
    }
    
           
    public void detener() {
        if (this.conectado){
            System.out.println("No se se puede detener porque no esta conectado el Carro electrico. ");
        }else
    System.out.println("Deteniendo el Carro electrico...");
    }
    
    public void desconectar() {
    System.out.println("Desconectaando Carro electrico...");
    this.conectado = false;
    }
}
