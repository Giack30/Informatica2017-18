package ch.makery.address;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        try {
            Socket s = new Socket("localhost", 9090); //impostato localhost che indica indirizzo IP 127.0.0.1 ma si può cambiare e la porta di trasmissione 
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            out.println("ciao a tutti");
            s.close();
            
        } catch (IOException ex) {
            System.err.println("server non attivo");
        }
    }
    
}
