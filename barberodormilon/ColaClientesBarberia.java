/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberodormilon;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author dotto
 */
public class ColaClientesBarberia<E> {
    private int max;
    private int totalClientes;
    private int clientesQueSeVan;
    private int vecesDormido;
    private int clientesAtendidos;
    
    private Queue<E> cola;
    private ReentrantLock bloqueo = new ReentrantLock(true);
    private Condition noVacio = bloqueo.newCondition();
    private Condition noLleno = bloqueo.newCondition();

    public ColaClientesBarberia(int max) {
            this.max = max;
            this.cola = new LinkedList();;
            this.clientesQueSeVan=0;
            this.totalClientes=0;
            this.vecesDormido=0;
            this.clientesAtendidos=0;
    }
    
    public void insertar(E element) {        
        bloqueo.lock();        

        try {
            while (cola.size() == max) {                
                System.out.println("Barberia llena, cliente se va..................................................... :( ");
                clientesQueSeVan=clientesQueSeVan+1;
                Barberia.ventana.setearClientesQueSeVan(clientesQueSeVan);
                noLleno.wait();//Le decimos al NOLLENO que espero xq SI ESTALLENO
            }
            
            totalClientes=totalClientes+1;
            cola.add(element);//Se agrega el cliente en la cola
            System.out.println("Ingreso cliente en silla #" + cola.size() + " -> No.Cliente : " + element);           
            Barberia.ventana.ingresoClienteForm(String.valueOf(totalClientes), cola.size() - 1);
            noVacio.signalAll();

        } catch (Exception e) {

        } finally {
            bloqueo.unlock();
        }
    }
    
    public E remover() {
         bloqueo.lock();

        try {
            while (cola.size() == 0) {                
                System.out.println("Barberia vacia, Barbero se duerme................................................... :) ");
                vecesDormido=vecesDormido+1;
                Barberia.ventana.setearVecesDormido(vecesDormido);
                noVacio.wait();//Le decimos al NOVACIO que espere xq SI ESTAVACIO
            }

            clientesAtendidos=clientesAtendidos+1;
            E element = cola.remove();
            System.out.println("Se atendio No.Cliente: " + element +" de la cola");
            Barberia.ventana.atenderClienteForm(String.valueOf(clientesAtendidos), cola.size());            
            noLleno.signal();
            return element;

        } catch (Exception e) {

            return null;
        } finally {
            bloqueo.unlock();
        }
    }
    
}
