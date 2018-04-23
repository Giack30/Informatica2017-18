/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class CreaLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        String Code="#fbec5d";
        String temp = null;
        boolean find=false;
        File f=new File("SemplificaColori.txt");
        Scanner sca=new Scanner(f);
        for(;sca.hasNextLine() && !find;){
           temp=sca.nextLine();
           find=temp.contains(Code);
           if(find==true) System.out.println(temp);
        }

    }
    
}
