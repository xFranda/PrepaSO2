/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepaso2;

import java.util.concurrent.Semaphore;
/**
 *
 * @author Franda
 */
public class PrepaSO2 {
    /**Prepa de Semaforos**/
    /**
     * @param args the command line arguments
     */
    
    public static Semaphore semaforo1 = new Semaphore(5);
    public static ProcesoLavado hilo1 = new ProcesoLavado();
    public static boolean check = true;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        hilo1 = new ProcesoLavado(semaforo1, "Lavadora");
        hilo2 = new ProcesoLavado(semaforo1,"Secadora");
        hilo3
        hilo1.start();
        
        while (check) {
            try {
                System.out.println("");
                
            } catch (Exception e) {
                
                
            }
        
        
        }
           
        
    }
    
}
