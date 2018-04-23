
import java.io.FileNotFoundException;

/**
 *
 * @author giacomo.ravagnan
 */
public class main {
	public static void main(String[] args) throws FileNotFoundException {
		inserimento in=new inserimento(1160);//arole sono 1160
		in.buildArray();
		System.out.println(in.costr.length);
		ABR dizionario=new ABR();
		in.buildABR();
		dizionario=in.getABR();
		dizionario.visitaSimmetrica(dizionario);
		}
	
}
