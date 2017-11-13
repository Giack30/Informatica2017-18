
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author giacomo.ravagnan
 */
public class inserimento {
	ABR <String> dizionario=new ABR();
	
	String[] costr;
	File file;
	Scanner scan;

	public inserimento(int numPar) throws FileNotFoundException{
		file = new File("1000_parole_italiane_comuni.txt");
		this.scan=new Scanner(file);
		costr=new String[numPar];
		
	}
	public boolean hasNextLine(){return scan.hasNextLine();}
	
	public String getNext(){
		String testo = null;
		if(scan.hasNextLine()){
			testo=scan.nextLine();
		}
		
		return testo;
	}
	public void buildABR(){
		buildArray();
		dizionario = dizionario.buildABR(costr, 0, costr.length, dizionario);
	}
	public void buildArray(){
		int cont=0;
		while(hasNextLine()){
			costr[cont]=getNext();
			cont++;
		}
	}
	public ABR getABR(){
		return dizionario;
	}
}
