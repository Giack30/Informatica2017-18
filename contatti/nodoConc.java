/**
 *
 * @author giacomo.ravagnan
 */
public class nodoConc <T> {
	Object info;
	nodoConc next;

	public nodoConc(Object info, nodoConc next) {
		this.info = info;
		this.next = next;
	}

	nodoConc() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
	
}