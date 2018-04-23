
import java.util.Random;
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
public class Cliente extends Thread{
    public int clientiEntrati;
    Random r=new Random();
    public Cliente(int entrateTot) {
        clientiEntrati=r.nextInt(entrateTot)+1;
        if(clientiEntrati>pizzeria.postiLiberi){
            clientiEntrati=pizzeria.postiLiberi;
            System.out.println("posti insufficienti possono entrare solo "+clientiEntrati+" clienti");
        }else{
            System.out.println("sono entrati "+clientiEntrati+" clienti");
        }
        pizzeria.entrateTot-=clientiEntrati;
        pizzeria.postiLiberi-=clientiEntrati;
    }
  
    @Override
    public void run(){
        try {
            pizzeria.postiPizzeria.acquire(clientiEntrati);
            System.out.println(clientiEntrati+" clienti si sono accomodati");
            int attesaServizio=r.nextInt(20)+20;//ridotti tempi per i test
            int tempoConsumazione=r.nextInt(2)+5;
            TimeUnit.SECONDS.sleep(attesaServizio);
            TimeUnit.SECONDS.sleep(tempoConsumazione);
            System.out.println(clientiEntrati+" hanno finito di mangiare");
            pizzeria.postiPizzeria.release(clientiEntrati);
            pizzeria.postiLiberi+=clientiEntrati;
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
