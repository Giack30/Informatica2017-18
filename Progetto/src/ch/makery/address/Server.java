package ch.makery.address;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       try {
           ServerSocket ss =new ServerSocket(9090);
            while(true){
                 Socket s = ss.accept();
                 InputStreamReader isr = new InputStreamReader(s.getInputStream());
                 BufferedReader in = new BufferedReader(isr);
                 System.out.println(" Dati ricevuti : "+in.readLine());
                 s.close();
            }
           
       }catch(Exception e){
           System.err.println("errore sconosciuto");
       }
    }
    
}
