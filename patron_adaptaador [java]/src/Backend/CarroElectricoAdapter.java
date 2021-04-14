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
public class CarroElectricoAdapter extends Carro {
    private CarroElectrico carroelectrico;
    
    
      public CarroElectricoAdapter() {
    super();
    System.out.println("Creando Carro Electrico adapter...");
    this.carroelectrico = new CarroElectrico();
    
    }

    @Override
    public void encender() {
         System.out.println("Encendiendo Carro Electrico adapter...");
          this.carroelectrico.conectar();
           this.carroelectrico.activar();
   }

    @Override
    public void acelearar() {
       System.out.println("Acelerando carro Electrico adapter...");
        this.carroelectrico.movermasrapido();
    }

    @Override
    public void apagar() {
     System.out.println("Apangando motor Electrico adapter...");
      this.carroelectrico.detener();
           this.carroelectrico.desconectar();
     }
    
    
}
