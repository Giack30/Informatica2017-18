package testnodoconc;
/**
 *
 * @author giacomo.ravagnan
 */
public class Pila <T>{
	NodoConc testa;
	int altezza=0;
	
	public void push(T element){
		NodoConc <T> pila=new NodoConc<T>(element, null);
		if(altezza==0){
			testa=pila;
			altezza++;
		}else{
			pila.next=testa;
			testa=pila;
			altezza++;
		}
	}
	public T top(){
		return (T) testa.info;
	}
	public boolean isEmpty(){
		return altezza==0;
	}
	public T pop(){
		if(altezza>0){
			T element=top();
			testa=testa.next;
			return element;
		}else{
			return null;
		}
	
	}	
}
