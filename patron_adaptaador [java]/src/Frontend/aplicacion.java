/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import Backend.Carro;
import Backend.CarroComun;
import Backend.CarroEconomico;
import Backend.CarroElectricoAdapter;
import java.util.Scanner;
/**
 *
 * @author Fernado
 */
public class aplicacion {
    
    private static Scanner s = new Scanner(System.in);
    private static Carro car;
    
    public static void main(String[] args) {
        int opcion;
        
        do{
        opcion = preguntaropcion();
        switch(opcion) {
            case 1 :
                car = new CarroComun();
                usarMotor();
                break;
                 case 2 :
                car = new CarroEconomico();
                usarMotor();
                break;
                 case 3 :
                car = new CarroElectricoAdapter();
                usarcarro();
                break;
                 case 4 :
               System.out.println("cerrar programa");
                break;
                default:
                    System.out.println("La opcion ingresada es incorrecta");
        }
        System.out.println("\n\n");
        }while(opcion!=4);
         
    }

    private static int preguntaropcion() {
           System.out.println(
                  "MENU DE OPCIONES\n"
            +"--------------------------\n"
            +"1. Encenderr carro comun. \n"
            +"2. Encencer carro economico. \n"
            +"3. encender carro electrico. \n"
            +"4. Salir. \n"
            +" Seleccionar opcion: "
           );
           
           return Integer.parseInt( s.nextLine());
    }

    private static void usarcarro() {
     
       Carro.encender();
       Carro.acelerar();
       Carro.apagar();
    }

}
