package testnodoconc;

/**
 *
 * @author giacomo.ravagnan
 */
public class NodoConc <T> {
	Object info;
	NodoConc<T> next;

	public NodoConc(T info, NodoConc<T> next) {
		this.info = info;
		this.next = next;
	}
	
	
}
