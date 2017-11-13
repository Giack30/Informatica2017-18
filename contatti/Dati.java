
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author giacomo.ravagnan
 */
public class Dati {
	public static void main(String[] args) throws FileNotFoundException {
		listaConcatenata <Contatto> contatti=new listaConcatenata();
		File es=new File("Z:\\SL03\\contacts.csv");
		Scanner reader=new Scanner(es);
		while(reader.hasNextLine()){
			scomposizione ez=new scomposizione(reader.nextLine());
			Contatto c=new Contatto(ez.getName(), ez.getSurname(), ez.getTelephone());
			contatti.addTail(c);
		}
		System.out.println(contatti.toString());
	}
}
