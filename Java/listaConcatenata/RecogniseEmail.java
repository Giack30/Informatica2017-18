package listeconcatenate;

import java.util.Scanner;

/**
 *
 * @author giacomo
 */
public class RecogniseEmail {
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        System.out.println("inserire il testo: ");
        String testo=c.next();
        testo+=" ";
        listaConcatenata <String> recognise=new listaConcatenata();
        int refStart=0;
        int refEnd=0;
        String subString=null;
        for(int i=0;i<testo.length();i++){
          if(testo.charAt(i)==',' || testo.charAt(i)=='.' || testo.charAt(i)==';' || testo.charAt(i)==':' || testo.charAt(i)==' ' || testo.charAt(i)=='@') {
              subString=testo.substring(refStart, refEnd);
              recognise.addTail(subString);
              refStart=i+1;
          }
          refEnd++;
        }
        System.out.println(recognise.toString());
    }
    
}
