package listeconcatenate;

import java.util.Scanner;

/**
 *
 * @author giacomo.ravagnan
 */
public class Test {
    public static void main(String[] args) {
        listaConcatenata <String > test = new listaConcatenata();
        Scanner c=new Scanner(System.in);
        System.out.println("inserire testo:     ");
        String info="";
        String exit="0";
        while(!info.equals(exit)){
            info=c.nextLine();
            if(!info.equals(exit)) test.addTail(info);
        }
        System.out.println(test.toString());
        System.out.println(test.Iterator().hasNext());
        
    }
}
