
import java.util.Random;
import java.util.concurrent.Semaphore;
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
public class pizzeria extends Thread {
    public static final Semaphore postiPizzeria=new Semaphore(12);
    public static int entrateTot=14;
    public static int personeEntrate;
    public static int postiLiberi=postiPizzeria.availablePermits();
    Random r=new Random();
    
    public void run(){
       for(int i=1;entrateTot!=0;i++){
           //System.out.println(i+"° Turno");
            try {
                int arrivoCameriere=r.nextInt(2);
                System.out.println("");
                if(arrivoCameriere==1){Thread c=new Thread(new Cameriere()); c.start();  }
                //System.out.println("entrate totali proca ciclo "+entrateTot);
                Thread t=new Thread(new Cliente(entrateTot));
                t.start();
                TimeUnit.SECONDS.sleep(12);
           } catch (InterruptedException ex) {
               Logger.getLogger(pizzeria.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
            
        
    }

//returna valore compreso tra min e max
public int numeroCasuale(int min, int max){
    Random r=new Random();
    return r.nextInt(max-min)+max;
}
}
