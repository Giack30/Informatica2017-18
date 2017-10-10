package listeconcatenate;
/**
 *
 * @author giacomo.ravagnan
 */
public class ListeConcatenate{ 
	public static void main(String[] args) {
		listaConcatenata<Integer> c ;
		Integer [] prova = new Integer[10];
		for(int i=0;i<prova.length;i++){
			prova[i]=i;
		}
		c= new listaConcatenata<Integer>(prova);
		System.out.println(c.size());
                System.out.println(c.get(0));
                //c.removeTail();
                //System.out.println(c.size());
                c.addHead(10);
                System.out.println(c.size());
                System.out.println(c.get(0));
                c.set(0, 145);
                System.out.println(c.size());
                System.out.println(c.get(0));
	}
	
}
