package rgb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author giacomo.ravagnan
 */
public class CreaTabella {
    File f;
    Scanner sca;

    public CreaTabella() throws FileNotFoundException {
        this.f=new File("NomiColori.txt");
        this.sca = new Scanner(f);
    }
    
    public void elaboraEsadecimale(){
        System.out.println(sca.hasNextLine());
        while(sca.hasNext()){
                    System.out.println("almeno quello lo faccio");
        if(sca.next().charAt(0)=='#'){
            System.out.println("trovato codice");
        }
        }
    }
}
