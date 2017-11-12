/**
 *
 * @author giacomo.ravagnan
 */
public class Contatto {
	String name;
	String surname;
	String telephone;

	public Contatto(String name, String surname, String telephone) {
		this.name = name;
		this.surname = surname;
		this.telephone = telephone;
	}
	public Contatto(){
	this(null,null,null);
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	@Override
	public String toString(){
		String testo = null;
		testo="[ "+getName()+" ; "+getSurname()+" ; "+getTelephone()+" ]";
		return testo;
	}
	
	
}
