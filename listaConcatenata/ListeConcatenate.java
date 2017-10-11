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
                System.out.println(c.toString());
		System.out.println(c.size());
                System.out.println(c.get(0));
                //c.removeTail();
                //System.out.println(c.size());
                c.addHead(10);
                System.out.println(c.size());
                System.out.println(c.get(0));
                c.set(1, 145);
                System.out.println(c.toString());
                c.add(0, 33);
                System.out.println(c.toString());
                System.out.println(c.size());
                //c.add(0, 22);
                //System.out.println(c.toString());
                //System.out.println(c.size());
                c.remove(9);
                System.out.println(c.size());
                System.out.println(c.toString());
                
	}
	
}
