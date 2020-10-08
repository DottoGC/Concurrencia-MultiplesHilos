/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberodormilon;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dotto
 */
public class Barberia {
    public static Interfaz ventana = new Interfaz();
    
    public static void main(String[] args) {        
        ExecutorService ejecutor = Executors.newCachedThreadPool();//Piscina de hilos
        
        ColaClientesBarberia<Integer> colaClientes = new ColaClientesBarberia<>(20);//Cola de clientes de 20 sillas
        
        ventana.setVisible(true);
        
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(50);             
                ejecutor.execute( new Hilo(colaClientes,i));

            } catch (InterruptedException ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
        ejecutor.shutdown();

        try {
            ejecutor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (Exception e) {
        
        }
    }
        
}
