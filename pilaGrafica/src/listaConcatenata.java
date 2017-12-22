

import java.util.Iterator;

/**
 *
 * @author giacomo.ravagnan
 * @param <T>
 */
public class listaConcatenata<T>{
	private nodoConc <T> testa;
	private nodoConc <T> coda;
	private int altezza=0;
	private int iterPos=0;
	
	public listaConcatenata(){
	testa=null; coda=null;	
	}
	public listaConcatenata(T[] array){
		for(int i=0;i<array.length;i++){
			addTail(array[i]);
		}
	}
	public void addTail (T elem){
	if(altezza==0){
		testa=new nodoConc <T>(elem,null);
		coda=testa;
		altezza++;
	}else{
		nodoConc <T> blocco= new nodoConc(elem,null);
		coda.next=blocco;
		coda=blocco;
		altezza++;
	}
	}
	public int size(){
		return altezza;
	}
	public void addHead(T elem){
		if(altezza==0){
			coda=new nodoConc <T>(elem,null);
			testa=coda;
			altezza++;
		}else{
			nodoConc <T> temp=testa;
			testa=new nodoConc <T>(elem,temp);
                        altezza++;
		}
	}
	public void removeHead(){
		if(altezza>0){
		nodoConc <T> temp=testa;
		testa=temp.next;
		altezza--;
		}else{System.out.println("coda vuota");}
	}
	public void removeTail(){
		if(altezza>0){
			nodoConc <T> temp= testa;
			for(int i=0;i<altezza-1;i++){
				temp=temp.next;
			}
			coda=temp;
			altezza--;
		}
	}
	public Object get(int n){
            nodoConc <T> blocco=testa;
		if(altezza>0 && n<=size()){
                for(int i=0;i<n;i++){
                    blocco=blocco.next;
                }
		}
		return getInfo(blocco);
	}
        public Object getInfo(nodoConc main){
            return main.info;     
        }
        public void set(int n, Object info){
            nodoConc <T> blocco=testa;
            if(altezza>0 && n<=size()){
            for(int i=0;i<n;i++){
                    blocco=blocco.next;
                }
            }
            blocco.info=info;
        }
        @Override
        public String toString(){
            String testo="[ ";
            nodoConc <T> temp=testa;
            testo+="\""+temp.info+"\"  ";
            for(int i=0;i<altezza-1;i++){
                temp=temp.next;
               testo+="\""+temp.info+"\"  "; 
            }
            testo+="]";
            return testo;
        }
        public void add(int n,T ele){
            nodoConc <T> nextBlock=testa;
            nodoConc <T> lastBlock = null;
            nodoConc <T> toAdd=new nodoConc(ele,null);
            if(altezza>0 && n<=size()){
                for(int i=0;i<n;i++){    
                    if(i==(n-1)) {lastBlock=nextBlock;}
                    nextBlock=nextBlock.next;
                }
               if(n==0) {testa=new nodoConc(ele,nextBlock);}else{
                lastBlock.next=toAdd;
                toAdd.next=nextBlock;   
               } 
               altezza++;
        }
        }
        public void remove(int n){
         nodoConc <T> nextBlock=testa;
         nodoConc <T> lastBlock = null; 
         if(altezza>0 && n<=size()){
                for(int i=0;i<n+1;i++){    
                    if(i==(n-1)){lastBlock=nextBlock;}
                        nextBlock=nextBlock.next;
                }
                if(n==0){removeHead();}else{
                lastBlock.next=nextBlock;
                altezza--;
                }
        }
        }
        public Iterator Iterator(){
            return new Iterator(){
                nodoConc <T> elem = testa;
                int length=0;
                @Override
                public boolean hasNext() {
                   return length+1<=altezza;
                }

                @Override
                public Object next() {
                    if(hasNext()){
                        T temp = (T) elem.info;
                        elem=elem.next;
                        length++;
                        return temp;
                    }else{
                        return null;
                    }
                    
                }
                
                public void goFirst(){
                    elem=testa;
                }
                
            };
            
        }


}

