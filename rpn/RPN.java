package testrpn;

import java.util.ArrayList;
import testnodoconc.Pila;

/**
 *
 * @author giacomo.ravagnan
 */
public class RPN {
	 private ArrayList<element> array=new ArrayList();

    

    public void append(int n){

        array.add(new element(n));

    }

            

    public void append(char c){

        array.add(new element(c));

    }

    

    public int value(){

        Pila<Integer> p=new Pila();

        for(int i=0;i<array.size();i++){

            if(array.get(i).isValue()){

                int risultato=0;

                int op2=p.pop();

                int op1=p.pop();

                switch(array.get(i).getOpe()){
                    case '+': risultato=op1+op2;
						break;
                    case '-': risultato=op1-op2;
					     break;
                    case '*': risultato=op1*op2;
						 break;
                    case '/': risultato=op1/op2;
							break;

                }
                p.push(risultato);
            } else{
                p.push(array.get(i).getInfo());
            }
        }
        return p.top();
}
}
