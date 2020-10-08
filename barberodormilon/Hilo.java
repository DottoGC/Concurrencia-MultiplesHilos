/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberodormilon;

import java.util.Random;

/**
 *
 * @author dotto
 */
public class Hilo implements Runnable {
    ColaClientesBarberia<Integer> colaClientes;
    int numero;
    boolean insertar;

    public Hilo(ColaClientesBarberia<Integer> cola, int numero) {
        this.colaClientes = cola;
        this.numero = numero;
    }
    
    @Override
    public void run() {
        Random random = new Random();        
        int random_number = random.nextInt(2);

        if (random_number == 0) {
            colaClientes.insertar(numero);
        } else {
            colaClientes.remover();
        }
    }
    
}
