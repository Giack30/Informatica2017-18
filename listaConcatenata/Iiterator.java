package iterator;
/**
 *
 * @author giacomo.ravagnan
 */
public interface Iiterator <T>{
	boolean isInside();
	void goNext();
	void goFirst();
	T currentEle();
}
