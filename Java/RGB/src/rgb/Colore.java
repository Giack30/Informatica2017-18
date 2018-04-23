package rgb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author giacomo.ravagnan
 */
public class Colore {
    public Colore(String code) throws FileNotFoundException{
        String Code=code;
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
