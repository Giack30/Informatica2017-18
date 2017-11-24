
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giacomo.ravagnan
 */
public class Cameriere extends Thread{

    public Cameriere(){
    }

    
    @Override
    public void run(){
        
        System.out.println("arrivato il cameriere");
        System.out.println("posti liberi: "+pizzeria.postiLiberi);
    }
}
