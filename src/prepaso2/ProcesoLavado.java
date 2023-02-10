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
public class ProcesoLavado extends Thread {
    
    public Boolean keep = true;
    public Semaphore semaforoMain;
    public String text;
    
    public ProcesoLavado(Semaphore semaforo1, String texto){
        this.semaforoMain = semaforo1;
        this.text = texto;
    }
    
    
    @Override
    public void run(){
        
        while(this.keep){
            
            try {
                this.semaforoMain.acquire();
                System.out.println(this.semaforoMain.getQueueLength());
                Thread.sleep(1000);
                
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
}
