package listeconcatenate;


/**
 *
 * @author giacomo.ravagnan
 */
public class testIter{
	public static void main(String[] args) {
		listaConcatenata <Integer> prova=new listaConcatenata();
		for(int i=0; i<10;i++){
			prova.addTail(i);
		}
		System.out.println(prova.toString());
		for(int i=0;i<10;i++){
			System.out.println("at pos: "+i+" u find: "+prova.currentEle());
			prova.goNext();
		}
		prova.goFirst();
		System.out.println(prova.currentEle());
	}
	
}
