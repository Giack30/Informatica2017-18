/**
 *
 * @author giacomo.ravagnan
 */
public class scomposizione {
	String name;
	String surname;
	String telephone;
	String info;
	
	public scomposizione(String info){
		this.info=info;
		sezione();
	}
	public void sezione(){
		int posIni=0;
		int posFin=0;
		int contPar=0;
		for(int i=0;i<info.length();i++){
			if(contPar<3){
			if(info.charAt(i)!=',' && info.charAt(i+1)==',' && contPar<3){
				posFin=i+1;
				String word=info.substring(posIni, posFin);
				contPar++;
				switch(contPar){
					case 1: name=word; break;
					case 2: surname=word; break;
					case 3: telephone=word; break;
				}
					
			}
			if(info.charAt(i)==',' && info.charAt(i+1)!=','){
				posIni=i+1;
			}
		}
		}
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
	
	
}
